import java.util.*;

public class testing
{
	public static void main(String[] args)
	{
		LinkedList<Integer> list = new LinkedList<Integer>();

		for(int i = 0; i < 50000; i++)
		{
			list.add(new Integer(i));
		}
		
		long startTime = System.currentTimeMillis();
		useIterator(list);
		long endTime = System.currentTimeMillis();
		long executionTime = endTime - startTime;
		
		long startTime2 = System.currentTimeMillis();
		useGet(list);
		long endTime2 = System.currentTimeMillis();
		long executionTime2 = endTime2 - startTime2;
		
		System.out.println(Long.toString(executionTime));
		System.out.println(Long.toString(executionTime2));
		
	}
	
	private static <E extends List> void useIterator(E list)
	{
		Iterator<E> iterator = list.iterator();
		for(int i = 0; i < list.size(); i++)
		{
			iterator.next();
		}
	}
	
	private static <E extends List> void useGet(E list)
	{
		for(int i = 0; i < list.size(); i++)
		{
			list.get(i);
		}
	}
}
