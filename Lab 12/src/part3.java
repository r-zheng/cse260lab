import java.util.ArrayList;
import java.util.List;

public class part3
{
	public static void main(String[] args)
	{
		List<Person> personsList = new ArrayList<Person>();
		personsList.add(new Person("Idiot", Person.Sex.MALE));
		personsList.add(new Person("Asshole", Person.Sex.MALE));
		personsList.add(new Person("Dummy", Person.Sex.FEMALE));
		personsList.add(new Person("Richard", Person.Sex.MALE));
		personsList.add(new Person("RanOutOfNames", Person.Sex.FEMALE));
		personsList.stream().filter(e -> e.getGender() == Person.Sex.MALE).forEach(e -> System.out.println(e.getName()));
	}
}
