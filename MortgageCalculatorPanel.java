// Mortgage claculator GUI

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

public class MortgageCalculatorPanel extends JFrame

{
  private JLabel inputLabel1, inputLabel2, inputLabel3, outputLabel1, outputLabel2;
  private JTextField principal, interest, period, monthlyPayment, totalPayment;

   // Constructor sets up the main GUI components.

   public MortgageCalculatorPanel()
   {

    super (" Mortgage Calculator");
    setLayout( new FlowLayout());

	inputLabel1 = new JLabel ("Principal: $");
	inputLabel2 = new JLabel ("Period in Months:");
	inputLabel3 = new JLabel ("Interest:");
	outputLabel1 = new JLabel ("Monthly Payment:$");
	outputLabel2 = new JLabel ("Total Payment:$");

        principal = new JTextField (10);
	interest = new JTextField (10);
	period = new JTextField (10);
	monthlyPayment = new JTextField (10);
	totalPayment = new JTextField (10);

	add (inputLabel1);
	add (principal);
	add (inputLabel2);
	add (period);
	add (inputLabel3);
	add (interest);
	add (outputLabel1);
	add (monthlyPayment);
	add (outputLabel2);
	add (totalPayment);

    	// register event handlers
	TextFieldHandler handler = new TextFieldHandler();
	inputLabel1.addActionListener(handler);
	inputLabel2.addActionListener(handler);
	inputLabel3.addActionListener(handler);

    }// End Constructor.

  //private inner class for event handling
  public class TextFieldHandler implements ActionListener
  {
   //process text field events
   public void actionPerformed( ActionEvent event)
   {

  	double principal;
	double interest;
	double period;
	double monthlyPayment;
	double totalPayment;
}