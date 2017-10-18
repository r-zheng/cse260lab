import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class part1
{	
	public static void main(String[] args)
	{
		SortedSet<String> set = new TreeSet<String>(new StringComparator());
		for(String s:args)
			set.add(s);
		System.out.println(set);
	}
}

class StringComparator implements Comparator<String>
{
	public int compare(String arg0, String arg1)
	{
		arg0 = arg0.toLowerCase();
		arg1 = arg1.toLowerCase();
		return arg0.compareTo(arg1);
	}
}