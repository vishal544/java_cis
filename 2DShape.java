public abstract class 2DShape implements Shape

{
  
  private double x;
  private double y;

   public 2DShape ( double x, double y )

   {
     xDimension = x;
     yDimension = y;
   }

   public void setx ( double x )
   {
     xDimension = x;
   }

   public double getx()
   {
     return xDimension;
   }

   public void sety ( double y )
   {
     yDimension = y;
   }

   public double gety()
   {
     return yDimension;
   }

   @Override
   public string toString()
   {
     return String.format ("%d %d\n, gety(), getx());
   }
}
