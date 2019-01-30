class Circle implements GeometricObject

{
	double radius =1.0;
	Circle(double c)
	{
	   radius=c;
	}
	Circle()
	{
	   radius=0 ;
	}
	public double getperimeter()
	{
	   return 2*3.14*radius;
	}
	public double getarea()
	{
	   return 3.14*radius*radius;
	}
}