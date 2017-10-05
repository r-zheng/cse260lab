import java.util.ArrayList;

public class ComplexMatrix<E extends GenericMatrix> extends GenericMatrix
{	
	protected ComplexNumber add(ComplexNumber o1, ComplexNumber o2)
	{ 
		return o1.add(o2); 
	}
	
	protected ComplexNumber multiply(ComplexNumber o1, ComplexNumber o2)
	{
		return	o1.multiply(o2);
	}
	
	class ComplexNumber
	{
		int a;
		int b;

		public ComplexNumber(int a, int b)
		{
			this.a = a;
			this.b = b;
		}
		
		public int getA()
		{
			return a;
		}
		
		public int getB()
		{
			return b;
		}
		
		public ComplexNumber add(ComplexNumber x)
		{
			return new ComplexNumber(a + x.getA(), b + x.getB());
		}
	}
}
