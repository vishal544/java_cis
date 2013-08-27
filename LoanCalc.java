//Programming assignment 2 problem 3
//loan calculator program
import java.util.Scanner;//program uses class Scanner

public class LoanCalc
{
   //main method begins execution of java application
  public static void main(String args[])
  {
    // create Scanner to obtain input from command window
    Scanner input=new Scanner(System.in);

    double amount;// loan amount
    double rate;// annual interest rate
    double period;// loan period
    double monthly;// monthly payment
    double total;// total payment

    
     System.out.print("Enter loan amount:");// prompt
     amount=input.nextDouble();// read number from user

     
     System.out.print("Enter annual interest rate:");// prompt
     rate=input.nextDouble();// read number from user

     rate=rate/12;
     
     System.out.print("Enter loan period:");// prompt
     period=input.nextDouble();// read number from user

     
     monthly=(amount*rate)/(1-(Math.pow(1/(1+rate),period)));

     total=monthly*period;

     System.out.printf("monthly is %.2f\n",monthly);// display monthly payment

     System.out.printf("total is %.2f\n",total);//display total payment

   }// end method main
}//end class LoanCalc

      