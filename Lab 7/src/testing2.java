import java.util.*;

public class testing2
{
	public static void main(String[] args)
	{		
		long startTime = System.currentTimeMillis();
		testArrayList();
		long endTime = System.currentTimeMillis();
		long executionTime = endTime - startTime;
		
		long startTime2 = System.currentTimeMillis();
		testArray();
		long endTime2 = System.currentTimeMillis();
		long executionTime2 = endTime2 - startTime2;
		
		System.out.println(Long.toString(executionTime));
		System.out.println(Long.toString(executionTime2));
		
	}
	

	private static void testArrayList()
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < 50000; i++)
		{
			list.add(new Integer(i));
		}
		
		Iterator<Integer> iterator = list.iterator();
		for(int i = 0; i < list.size(); i++)
		{
			iterator.next().toString();
		}
		
		while(!list.isEmpty())
		{
			list.remove(0);
		}
		System.out.println(list);
	}
	
	private static void testArray()
	{
		Integer[] list = new Integer[50000];
		for(int i = 0; i < 50000; i++)
		{
			list[i] = new Integer(i);
		}
		
		System.out.println(list.length);
		
		for(int i = 0; i < list.length; i++)
		{
			list[i].toString();
		}
		
		for(int i = 0; i < list.length; i++)
		{
			list[i] = null;
		}
	}
	
}
