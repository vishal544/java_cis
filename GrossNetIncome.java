//Programming assignment 1 problem 1
//Gross and net income
import java.util.Scanner;//program uses class Scanner

public class GrossNetIncome
{
  //main method begins execution of Java application
  public static void main(String args[])
  {
    // create Scanner to obtain input from command window
    Scanner input=new Scanner(System.in);

     double hoursworked; // first number to multiply
     double payrate;// second number to multiply
     double grosspay;// product of hoursworked and payrate
     double netpay;// grospay less taxes
     double taxrate;// tax

     System.out.print("Enter hours worked: ");// prompt
     hoursworked=input.nextDouble();// read hours worked from user

     System.out.print("Enter payrate: ");// prompt
     payrate=input.nextDouble();// read payrate from user

     System.out.print("Enter taxrate: ");// prompt
     taxrate=input.nextDouble();// read taxrate from user

     grosspay=hoursworked*payrate;//multiply numbers;

     netpay=grosspay-grosspay*taxrate/100;

     System.out.printf("grosspay is %.2f\n",grosspay);// display grosspay

     System.out.printf("netpay is %.2f\n",netpay);// display netpay


  } // end method main

}//end class GrossNetIncome