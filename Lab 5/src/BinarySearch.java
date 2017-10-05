
public class BinarySearch
{
	public static <E extends Comparable<E>> int binarySearch(E[] list, E key)
	{
		
		return search(list, key, 0, list.length - 1);
	}
	
	private static <E extends Comparable<E>> int search(E[] list, E key, int startI, int endI)
	{
		int i = (startI + endI) / 2;
		if(key.compareTo(list[i]) == 0)
		{
			return i;
		}
		if(key.compareTo(list[i]) > 0)
		{
			return search(list, key, i + 1, endI);
		}
		else
		{
			return search(list, key, startI, i - 1);
		}
	}
}
