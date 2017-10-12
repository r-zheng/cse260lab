import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class NonduplicateWords
{
	public static void main(String[] args)
	{
		try
		{
			FileReader fileReader = new FileReader(args[0]);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			String fileString = "";
			String s = bufferedReader.readLine();
			while(s != null)
			{
				fileString += s + " ";
				s = bufferedReader.readLine();
			}
			System.out.println(fileString);
			String[] splitString = fileString.split("\\s");
			
			TreeSet<String> set = new TreeSet<String>(Arrays.asList(splitString));
			System.out.print(set);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
