
public class SynchronizeThreads
{	
	static IntWrap sum = new IntWrap(0);
	public static void main(String[] args)
	{
		class add1Thread extends Thread
		{
			public synchronized void run()
			{
				sum = new IntWrap(sum.getN() + 1);
			}
		}
		add1Thread[] tds = new add1Thread[1000];
		for(int i = 0; i < 1000; i++)
		{
			tds[i] = new add1Thread();
		}
		for(int i = 0; i < 1000; i++)	
		{
			tds[i].start();
		}
		
		System.out.println(sum.toString());
	}
}
