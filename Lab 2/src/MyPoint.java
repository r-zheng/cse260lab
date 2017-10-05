public class MyPoint {
	
	private double x;
	private double y;
	
	public MyPoint()
	{
		x = 0;
		y = 0;
	}
	
	public MyPoint(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	
	public double getX()
	{
		return x;
	}
	
	public double getY()
	{
		return y;
	}
	
	public double distance(MyPoint o)
	{
		return distance(o.getX(), o.getY());
	}
	
	public double distance(double x, double y)
	{
		return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
	}
}
