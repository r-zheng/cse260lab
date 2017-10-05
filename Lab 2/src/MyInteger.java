public class MyInteger
{
	private int n;
	
	public MyInteger(int n)
	{
		this.n = n;
	}
	
	public int getInt()
	{
		return n;
	}
	
	public boolean isEven()
	{
		return isEven(n);
	}
	
	public boolean isOdd()
	{
		return isOdd(n);
	}
	
	public boolean isPrime()
	{
		return isPrime(n);
	}
	
	public static boolean isEven(int n)
	{
		if(n % 2 == 0)
			return true;
		else
			return false;
	}
	
	public static boolean isOdd(int n)
	{
		if(n % 2 == 0)
			return false;
		else
			return true;
	}
	
	public static boolean isPrime(int n)
	{
		if(n == 1)
			return false;
		else if((n == 2) || (n == 3))
			return true;
		else
		{
			for(int i = 2; i <= (n / 2); i++)
			{
				if(n % i == 0)
					return false;
			}
		}
		return true;
	}
	
	public static boolean isEven(MyInteger n)
	{
		return isEven(n.getInt());
	}
	
	public static boolean isOdd(MyInteger n)
	{
		return isOdd(n.getInt());
	}
	
	public static boolean isPrime(MyInteger n)
	{
		return isPrime(n.getInt());
	}
	
	public boolean equals(int n)
	{
		if(this.n == n)
			return true;
		else
			return false;
	}

	public boolean equals(MyInteger n)
	{
		return equals(n.getInt());
	}
	
	public static int parseInt(String s)
	{
		int n = 0;
		for(int i = 0; i < s.length(); i++)
		{
			char c = s.charAt(i);
			n += (int)(c - '0') * Math.pow(10, s.length() - 1 - i);
		}
		return n;
	}
	
	public static void main(String[] args)
	{
		System.out.println(isEven(150));
		System.out.println(isOdd(2));
		System.out.println(isPrime(3));
		System.out.println(isPrime(4));
		System.out.println(isPrime(5));
		System.out.println(isPrime(27));
		MyInteger test = new MyInteger(parseInt("35936852"));
		MyInteger test2 = new MyInteger(35936852);
		System.out.println(test.equals(3));
		System.out.println(test.equals(test2));
		System.out.println(test.getInt());
	}
		
	
}
