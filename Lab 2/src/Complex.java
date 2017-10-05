public class Complex {
	private int a;
	private int b;
	
	public Complex(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	
	public Complex(int a)
	{
		this.a = a;
		this.b = 0;
	}
	
	public Complex()
	{
		this.a = 0;
		this.b = 0;
	}
	
	public int getRealPart()
	{
		return a;
	}
	
	public int getImaginaryPart()
	{
		return b;
	}
	
	public String toString()
	{
		return (a + " + " + b + "i");
	}
}
