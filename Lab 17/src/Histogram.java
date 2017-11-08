import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Histogram extends Pane
{
	private String file = new String();
	static int[] counts = new int[26];
	
	public Histogram()
	{
//		try
//		{
//			FileReader fileReader = new FileReader(???????);
//			BufferedReader bufferedReader = new BufferedReader(fileReader);
//			
//			String line = bufferedReader.readLine();
//			while(line != null)
//			{
//				file += (line + "\n");
//				line = bufferedReader.readLine().toUpperCase();
//			}
//			bufferedReader.close();
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
		
		file = "aaaaaaaabbbbbcdefghijjjkllllllmmmnoooPPPPQrrrssstuuuvvvwwwxxxxyzzzz";
		file = file.toUpperCase();
		char c;
		for(int i = 0; i < file.length(); i++)
		{
			c = file.charAt(i);
			if((c >= 'A') && (c <= 'Z'))
			{
				counts[c - 65] += 1;
			}
		}
		System.out.println(file);
		System.out.println(Arrays.toString(counts));
		displayHistogram();
	}
	
	public void setCount(char c, int count)
	{
		counts[c - 65] = count;
		displayHistogram();
	}
	
	private void displayHistogram()
	{
		for(int i = 0; i < 26; i++)
		{
			Rectangle rectangle = new Rectangle(50 + 25 * i, 50, 25, counts[i] * 25);
			getChildren().add(rectangle);
		}
	}
}
