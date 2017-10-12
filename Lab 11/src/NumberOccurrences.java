import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class NumberOccurrences
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		Integer input = null;
		HashMap<Integer, Integer> integerCounts = new HashMap<Integer, Integer>();
		do
		{
			input = scanner.nextInt();
			if(integerCounts.containsKey(input))
			{
				integerCounts.put(input, integerCounts.get(input) + 1);
			}
			else
			{
				integerCounts.put(input, 1);
			}
			
		} while(input != 0);
		
		int currentMax = 0;
		ArrayList<Integer> maxIntegers = new ArrayList<Integer>();
		for(Integer i:integerCounts.keySet())
		{
			if(integerCounts.get(i) > currentMax)
			{
				currentMax = integerCounts.get(i);
				maxIntegers.removeAll(maxIntegers);
				maxIntegers.add(i);
			}
			else if(integerCounts.get(i) == currentMax)
			{
				maxIntegers.add(i);
			}
		}
		
		System.out.println(maxIntegers);
	}
}
