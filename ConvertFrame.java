// Exercise 14.13 Solution: ConvertFrame.java
// Program converts temperatures.
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class ConvertFrame extends JFrame 
{
   private JPanel fromJPanel;
   private JPanel toJPanel;
   private JLabel label1;
   private JLabel label2;
   private JLabel label3;
   private JLabel label4;
   private JTextField tempJTextField1;
   private JTextField tempJTextField2;
   private ButtonGroup fromButtonGroup;
   private ButtonGroup toButtonGroup;
   private JRadioButton celsiusToJRadioButton;
   private JRadioButton fahrenheitToJRadioButton;
   private JRadioButton kelvinToJRadioButton;
   private JRadioButton celsiusFromJRadioButton;
   private JRadioButton fahrenheitFromJRadioButton;
   private JRadioButton kelvinFromJRadioButton;

   // constructor sets up GUI
   public ConvertFrame()
   {
      super( "Temperature Conversion" );

      // create ButtonGroup for from JRadioButtons
      fahrenheitFromJRadioButton = 
         new JRadioButton( "Fahrenheit", true );
      celsiusFromJRadioButton = new JRadioButton( "Celsius", false );
      kelvinFromJRadioButton = new JRadioButton( "Kelvin",   false );
      fromButtonGroup = new ButtonGroup();
      fromButtonGroup.add( fahrenheitFromJRadioButton );
      fromButtonGroup.add( celsiusFromJRadioButton );
      fromButtonGroup.add( kelvinFromJRadioButton );

      // create ButtonGroup for to JRadioButtons
      fahrenheitToJRadioButton = 
         new JRadioButton( "Fahrenheit", false );
      celsiusToJRadioButton = new JRadioButton( "Celsius", true );
      kelvinToJRadioButton = new JRadioButton( "Kelvin", false );
      toButtonGroup = new ButtonGroup();
      toButtonGroup.add( fahrenheitToJRadioButton );
      toButtonGroup.add( celsiusToJRadioButton );
      toButtonGroup.add( kelvinToJRadioButton );

      // create from JPanel
      fromJPanel = new JPanel();
      fromJPanel.setLayout( new GridLayout( 1, 3 ) );
      fromJPanel.add( fahrenheitFromJRadioButton );
      fromJPanel.add( celsiusFromJRadioButton );
      fromJPanel.add( kelvinFromJRadioButton );

      // create to JPanel
      toJPanel = new JPanel();
      toJPanel.setLayout( new GridLayout( 1, 3 ) );
      toJPanel.add( fahrenheitToJRadioButton );
      toJPanel.add( celsiusToJRadioButton );
      toJPanel.add( kelvinToJRadioButton );

      // create labels
      label1 = new JLabel( "Convert from:" );
      label2 = new JLabel( "Convert to:" );
      label3 = new JLabel( "Enter Numeric Temperature: " );
      label4 = new JLabel( "Comparable Temperature is: " );

      // create JTextField for getting temperature to be converted 
      tempJTextField1 = new JTextField( 10 );
      tempJTextField1.addActionListener(

         new ActionListener() // anonymous inner class
         {  
            // perform conversions
            public void actionPerformed( ActionEvent event )
            {
               int convertTemp, temp;

               temp = Integer.parseInt( ( ( JTextField )
                  event.getSource() ).getText() );

               // Fahrenheit to Celsius
               if ( fahrenheitFromJRadioButton.isSelected() && 
                  celsiusToJRadioButton.isSelected() ) 
               {
                  convertTemp = ( int ) ( 5.0f / 9.0f * ( temp - 32 ) );
                  tempJTextField2.setText(
                     String.valueOf( convertTemp ) );
               } // end if
               // Fahrenheit to Kelvin
               else if ( fahrenheitFromJRadioButton.isSelected() &&
                  kelvinToJRadioButton.isSelected() ) 
               {
                  convertTemp = ( int ) 
                     ( 5.0f / 9.0f * ( temp - 32 ) + 273.15 );
                  tempJTextField2.setText( 
                     String.valueOf( convertTemp ) );
               } // end else if
               // Celsius to Fahrenheit
               else if ( celsiusFromJRadioButton.isSelected() &&
                  fahrenheitToJRadioButton.isSelected() ) 
               {
                  convertTemp = ( int ) ( 9.0f / 5.0f * temp + 32 );
                  tempJTextField2.setText( 
                     String.valueOf( convertTemp ) );
               } // end else if
               // Celsius to Kelvin
               else if ( celsiusFromJRadioButton.isSelected() &&
                  kelvinToJRadioButton.isSelected() ) 
               {
                  convertTemp = ( int ) ( temp + 273.15 );
                  tempJTextField2.setText(
                     String.valueOf( convertTemp ) );
               } // end else if
               // Kelvin to Celsius
               else if ( kelvinFromJRadioButton.isSelected() &&
                  celsiusToJRadioButton.isSelected() ) 
               {
                  convertTemp = ( int ) ( temp - 273.15 );
                  tempJTextField2.setText(
                     String.valueOf( convertTemp ) );
               } // end else if
               // Kelvin to Fahrenheit
               else if ( kelvinFromJRadioButton.isSelected() &&
                  fahrenheitToJRadioButton.isSelected() ) 
               {
                  convertTemp = 
                     ( int ) ( 9.0f / 5.0f * ( temp - 273.15 ) + 32 );
                  tempJTextField2.setText( 
                     String.valueOf( convertTemp ) );
               } // end else if
               // source and destination are the same; just copy value
               else
                  tempJTextField2.setText( String.valueOf( temp ) );
            } // end method actionPerformed
         } // end anonymous inner class
      ); // end call to addActionListener

      // JTextField to display temperature after conversion
      tempJTextField2 = new JTextField( 10 );
      tempJTextField2.setEditable( false );

      // add components to GUI
      setLayout( new GridLayout( 8, 1 ) );
      add( label1 );
      add( fromJPanel );
      add( label3 );
      add( tempJTextField1 );
      add( label2 );
      add( toJPanel );
      add( label4 );
      add( tempJTextField2 );
   } // end ConvertFrame constructor
} // end class ConvertFrame

/**************************************************************************
 * (C) Copyright 1992-2010 by Deitel & Associates, Inc. and               *
 * Prentice Hall. All Rights Reserved.                                    *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
