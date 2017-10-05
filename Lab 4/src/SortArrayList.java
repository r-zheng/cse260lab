import java.util.ArrayList;

public class SortArrayList
{
	public static <E extends Comparable<E>> void sort(ArrayList<E> list)
	{
		E currentMax;
		int currentMaxIndex;
		for(int i = list.size() - 1; i >= 1; i--)
		{
			currentMax = list.get(i);
			currentMaxIndex = i;
			for(int j = i - 1; j >= 0; j--)
			{
				if(((Comparable)currentMax).compareTo(list.get(j)) < 0)
				{
					currentMax = list.get(j);
					currentMaxIndex = j;
					
				}
			}
			list.add(currentMaxIndex, list.get(i));
			list.add(i, currentMax);
		}
	}
}
