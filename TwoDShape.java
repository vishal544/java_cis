public abstract class TwoDShape implements Shape

{
  
  private double xDimension;
  private double yDimension;

   public TwoDShape ( double x, double y )

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
   public String toString()
   {
     return String.format ("%d %d\n", gety(), getx());
   }
}
