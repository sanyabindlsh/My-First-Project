class ResizableCircle extends Circle implements Resizable
{
	ResizableCircle(double r)
	{
	   radius=r;
	}
	ResizableCircle()
	{
	   radius=0;
	}
	public int resize(int percent)
	{
	   return (int)(radius+((percent/100)*radius));
	}
}