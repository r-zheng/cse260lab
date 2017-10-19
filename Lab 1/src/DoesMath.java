import java.util.*;

public class DoesMath {
	public static void main(String[] args)
	{
		int[] a = new int[5];
		a[0] = 2;
		a[1] = 4;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		System.out.println(printDistinctNumbers(a));
		extimateExecutionTimes();
		howManyCollatzIterations(99);
	}
	
	private static ArrayList<Integer> printDistinctNumbers(int[] numbers)
	{
		ArrayList<Integer> distinctNumbers = new ArrayList<Integer>();
		for (int i:numbers)
		{
			if (!distinctNumbers.contains(i))
			{
				distinctNumbers.add(i);
			}
		}
		return distinctNumbers;
	}
	
	private static int extimateExecutionTimes()
	{
		int[] bigArray = new int[100000];
		for (int i = 0; i < 100000; i++)
		{
			int j = (int) (Math.random() * 1000000000);
			bigArray[i] = j;			
		}
		int select = (int)(Math.random() * 100000);
		int key = bigArray[select];
		Arrays.sort(bigArray);
		System.out.println(linearSearchTime(bigArray, key));
		System.out.println(binarySearchTime(bigArray, key));
		return 0;
	}
	
	private static long linearSearchTime(int[] array, int key)
	{
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < array.length; i++)
			if (key == array[1])
				break;
		long endTime = System.currentTimeMillis();
		long executionTime = endTime - startTime;
		return executionTime;
	}
	
	private static long binarySearchTime(int[] array, int key)
	{
		long startTime = System.currentTimeMillis();
		int low = 0;
		int high = array.length - 1;
		while (high >= low)
		{
			int mid = (low + high) / 2;
			if (key < array[mid])
				high = mid - 1;
			else if (key == array[mid])
				break;
			else
				low = mid + 1;
		}
		long endTime = System.currentTimeMillis();
		long executionTime = endTime - startTime;
		return executionTime;
	}
	
	private static void howManyCollatzIterations(int n)
	{
		System.out.print("Sequence: " + n);
		int iterations = doCollatz(n, 0);	
		System.out.print("\n# of iteratnions: " + iterations);
	}

	private static int doCollatz(int n, int sequenceNumber)
	{
		if (n % 2 == 0)
			n /= 2;
		else
			n = 3 * n + 1;
		sequenceNumber++;
		System.out.print(" " + n);
		if (n != 1)
		{
			sequenceNumber = doCollatz(n, sequenceNumber);
		}
		return sequenceNumber;
	}
}
