// Exercise 14.13 Solution: Convert.java
// Program converts temperatures.
import javax.swing.JFrame;

public class Convert 
{
   public static void main( String[] args )
   {
      ConvertFrame convertFrame = new ConvertFrame();
      convertFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      convertFrame.setSize( 300, 220 ); // set frame size
      convertFrame.setVisible( true ); // display frame
   } // end main
} // end class Convert


