import java.util.HashSet;
import java.util.Set;

public class SetOperations
{
	public static void main(String[] args)
	{
		Set<String> set1 = new HashSet<String>();
		set1.add("George");
		set1.add("Jim");
		set1.add("John");
		set1.add("Blake");
		set1.add("Kevin");
		set1.add("Michael");
		
		Set<String> set2 = new HashSet<String>();
		set2.add("George");
		set2.add("Katie");
		set2.add("Kevin");
		set2.add("Michelle");
		set2.add("Ryan");

		Set<String> unionSet = findUnion(set1, set2);
		System.out.println(unionSet);
		
		Set<String> differenceSet = findDifference(set1, set2);
		System.out.println(differenceSet);
		
		Set<String> intersectionSet = findIntersection(set1, set2);
		System.out.println(intersectionSet);
		
	}
	
	public static <E> Set<E> findUnion(Set<E> set1, Set<E> set2)
	{
		Set<E> unionSet = new HashSet<E>();

		for(E o:set1)
		{
			unionSet.add(o);
		}
		
		for(E o:set2)
		{
			unionSet.add(o);
		}
		return unionSet;
	}
	
	public static <E> Set<E> findDifference(Set<E> set1, Set<E> set2)
	{
		Set<E> differenceSet = new HashSet<E>();
		Set<E> intersectionSet = findIntersection(set1, set2);
		for(E o:set1)
		{
			if(!intersectionSet.contains(o))
			{
				differenceSet.add(o);
			}
		}
		
		for(E o:set2)
		{
			if(!intersectionSet.contains(o))
			{
				differenceSet.add(o);
			}
		}
		
		return differenceSet;
	}
	
	public static <E> Set<E> findIntersection(Set<E> set1, Set<E> set2)
	{
		Set<E> intersectionSet = new HashSet<E>();
		
		for(E o:set1)
		{
			for(E j:set2)
			{
				if(o.equals(j))
				{
					intersectionSet.add(o);
				}
			}
		}
		return intersectionSet;
	}
}
