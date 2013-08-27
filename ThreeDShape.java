public abstract class ThreeDShape implements Shape

{
  
  private double xDimension;
  private double yDimension;
  private double zDimension;

   public ThreeDShape ( double x, double y, double z )

   {
     xDimension = x;
     yDimension = y;
     zDimension = z;
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

   
   public void setz ( double z )
   {
     zDimension = z;
   }

   public double getz()
   {
     return zDimension;
   }

   @Override
   public String toString()
   {
     return String.format ("%d %d %d\n", gety(), getx(), getz());
   }
}
