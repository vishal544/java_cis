
import javax.swing.JFrame;

public class MortgageTest
{
   public static void main( String[] args )
   {
      MortgageCalculatorPanel mortgageCalculatorPanel = new MortgageCalculatorPanel();
      mortgageCalculatorPanel.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      mortgageCalculatorPanel.setSize( 250, 200 ); // set frame size
      mortgageCalculatorPanel.setVisible( true ); // display frame
   } // end main
} // end class 