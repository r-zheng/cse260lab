
public class Max
{
	public static <E extends Comparable<E>> E max(E[] list)
	{
		E currentMax = null;
		if(list.length > 0)
		{
			currentMax = list[0];
			for(int i = 1; i < list.length; i++)
			{
				if(list[i].compareTo(currentMax) > 0)
				{
					currentMax = list[i];
				}
			}
		}
		
		return currentMax;
	}
}
