import java.util.ArrayList;

public class LargestInArrayList
{
	public static <E extends Comparable<E>> E max(ArrayList<E> list)
	{
		SortArrayList.sort(list);
		return list.get(list.size() - 1);		
	}
}