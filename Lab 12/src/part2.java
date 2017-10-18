import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class part2
{
	public static void main(String[] args)
	{
		String[] stringArray = {"         I  ", "   Like  ", "  Turtles    "};
		List stringList = Arrays.asList(stringArray);
		trimStringsInAList(stringList);
		System.out.println(stringList);
	}
	
	public static <E extends String> void trimStringsInAList(List<E> list)
	{
		ListIterator<E> iterator = list.listIterator();
		while(iterator.hasNext())
		{
			E s = iterator.next();
			iterator.set((E) s.trim());
		}
	}
}
