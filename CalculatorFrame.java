// Calculator GUI

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculatorFrame extends JFrame implements ActionListener
{
   private JButton[] keys;
   private JPanel keyPadJPanel;
   private JTextField JTextField;

   // constructor sets up GUI
   public CalculatorFrame()
   {
      super( "Calculator" );

      JTextField = new JTextField( 20 ); 
      JTextField.setEditable( true ); 

      keys = new JButton[ 16 ]; // array keys contains 16 JButtons 

      // initialize all digit key buttons
      for ( int i = 0; i <= 9; i++ )
         keys[ i ] = new JButton( String.valueOf( i ) );

      // initialize all function key buttons
      keys[ 10 ] = new JButton( "/" );
      keys[ 11 ] = new JButton( "*" );
      keys[ 12 ] = new JButton( "-" );
      keys[ 13 ] = new JButton( "+" );
      keys[ 14 ] = new JButton( "=" );
      keys[ 15 ] = new JButton( "." );

      // set keyPadJPanel layout to grid layout
      keyPadJPanel = new JPanel();
      keyPadJPanel.setLayout( new GridLayout( 4, 4 ) );

      // add buttons to keyPadJPanel panel
      // 7, 8, 9, divide
      for ( int i = 7; i <= 10; i++ )
      {
         keyPadJPanel.add( keys[ i ] );
         keys[i].addActionListener(this);
      }

      // 4, 5, 6
      for ( int i = 4; i <= 6; i++ )
      {
         keyPadJPanel.add( keys[ i ] );
         keys[i].addActionListener(this);
      }

      // multiply
      keyPadJPanel.add( keys[ 11 ] );
      keys[11].addActionListener(this);

      // 1, 2, 3
      for ( int i = 1; i <= 3; i++ )
      {
         keyPadJPanel.add( keys[ i ] );
         keys[i].addActionListener(this);
      }

      // subtract
      keyPadJPanel.add( keys[ 12 ] );
      keys[12].addActionListener(this);

      // 0
      keyPadJPanel.add( keys[ 0 ] );
      keys[0].addActionListener(this);

      // ., =, add
      for ( int i = 15; i >= 13; i-- )
      {
         keyPadJPanel.add( keys[ i ] );
         keys[i].addActionListener(this);
      }

      // add components to (default) border layout
      add( JTextField, BorderLayout.NORTH );
      add( keyPadJPanel, BorderLayout.CENTER );
   } // end CalculatorFrame constructor

   public void actionPerformed(ActionEvent event)
   {
     JTextField.setText(event.getActionCommand());

     }
   

} // end class CalculatorFrame

