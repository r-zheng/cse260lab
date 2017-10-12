import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Letters
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		try
		{
			FileReader fileReader = new FileReader(scanner.nextLine());
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			Character[] vowelsArray = {'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'};
			List<Character> vowelsArrayList = Arrays.asList(vowelsArray);
			int consonants = 0;
			int vowels = 0;
			char s = Character.toUpperCase(((char) (bufferedReader.read())));
			HashMap<Character, Integer> vowelCounts = new HashMap<Character, Integer>();
			vowelCounts.put('A', 0);
			vowelCounts.put('E', 0);
			vowelCounts.put('I', 0);
			vowelCounts.put('O', 0);
			vowelCounts.put('U', 0);
			while((int)s >= 0)
			{
				if(vowelsArrayList.contains(s))
				{
					vowels ++;
					vowelCounts.put(s, vowelCounts.get(s) + 1);
				}
				else if((s >= 'A') && (s <= 'Z'))
				{
					consonants ++;
				}
				
				int s2 = (bufferedReader.read());
				if(s2 == -1)
				{
					break;
				}
				s = Character.toUpperCase((char) (s2));
			}
			System.out.println("vowels: " + vowels);
			System.out.println("consonants: " + consonants);
			System.out.println(vowelCounts);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		scanner.close();
	}
}
