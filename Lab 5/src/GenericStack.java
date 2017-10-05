import java.util.ArrayList;
import java.util.Scanner;

public class GenericStack<E> extends ArrayList
{
	ArrayList<E> list;
	
	public GenericStack()
	{
		 list = new ArrayList<E>();
	}
	
	public int getSize()
	{
		return list.size();
	}
	
	public E peek()
	{
		return list.get(getSize() - 1);
	}
	
	public E pop()
	{
		return list.remove(getSize() - 1);
	}
	
	public void push(E o)
	{
		list.add(o);
	}
	
	public boolean isEmpty()
	{
		return list.isEmpty();
	}
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		GenericStack stack = new GenericStack<String>();
		for(int i = 0; i < 5; i++)
		{
			System.out.println("Enter string: ");
			stack.push(input.nextLine());
		}
		
		for(int i = 0; i < 5; i++)
		{
			System.out.print(stack.pop() + " ");
		}
	}
}
