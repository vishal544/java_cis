//Programming assignment 4 problem 2
//Gross and net income using while statement
import java.util.Scanner;//program uses class Scanner

public class GrossNetIncome1
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
     double totalnet;//total net income
     double totalgross;//total gross income
     int counter;//number of employees entered

     //initialization phase
     totalnet=0;//initialize total
     totalgross=0;//initialize total
     counter=1;//counter

     //processing phase
     while(counter<=5)//loop 5 times
     {

     System.out.print("Enter hours worked: ");// prompt
     hoursworked=input.nextDouble();// read hours worked from user

     System.out.print("Enter payrate: ");// prompt
     payrate=input.nextDouble();// read payrate from user

     System.out.print("Enter taxrate: ");// prompt
     taxrate=input.nextDouble();// read taxrate from user

     


     counter=counter+1;

     grosspay=hoursworked*payrate;//multiply numbers;

     netpay=grosspay-grosspay*taxrate/100;

     totalnet=totalnet+netpay;

     
     totalgross=totalgross+grosspay;


     System.out.printf("grosspay is %.2f\n",grosspay);// display grosspay

     System.out.printf("netpay is %.2f\n",netpay);// display netpay

     System.out.printf("totalgross is %.2f\n",totalgross);// display totalgross

     System.out.printf("totalnet is %.2f\n",totalnet);// display totalnet
     
     }// end while

  } // end method main

}//end class GrossNetIncome1