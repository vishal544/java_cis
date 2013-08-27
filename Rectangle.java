// Exercise 8.4
// Rectangle class

public class Rectangle 
{
   double l; // length
   double w; // width

   //Declare class rectangle with constructor
   public void setRectangle(double l,double w)
   {
    l =(( l > 0.0 && l < 20.0) ? l : 0); // validate length
    w =(( w > 0.0 && w < 20.0) ? w : 0); // validate width

   }

   public double getLength()
   { return l;}

   public double getWidth()
   { return w;}
   
   //calculate area of rectangle

   double findArea()
   { return l*w;}

   //calculate perimeter of rectangle
   double findPerimeter()
   { return (l+w)*2;}

}// End class Rectangle
   



