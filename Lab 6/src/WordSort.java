import java.util.Comparator;

public class WordSort
{
	public static void main(String[] args)
	{
		String[] stringList = new String[args.length];
		sort(args);
		for(String s:args)
		{
			System.out.println(s);
		}
	}

	private static <E extends Comparable> void sort(E[] list)
	{
		for (int i = 0; i < list.length; i++) {
			// Find the minimum in the list[i..list.length-1]
			E currentMin = list[i];
			int currentMinIndex = i;
			for (int j = i + 1; j < list.length; j++) {
				if (currentMin.compareTo(list[j]) > 0) {
					currentMin = list[j];
					currentMinIndex = j;
				}
			}
			// Swap list[i] with list[currentMinIndex] if necessary;
			if (currentMinIndex != i) {
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
			}

		}

	}
}