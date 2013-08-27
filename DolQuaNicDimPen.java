//Programming assignment 1 problem 5
//Dollars, Quarters and Dimes
import java.util.Scanner;//program uses class Scanner

public class DolQuaNicDimPen
{
  //main method begins execution of Java application
  public static void main(String args[])
  {
    // create Scanner to obtain input from command window
    Scanner input=new Scanner(System.in);

     double purchased; // purchase amount
     double paid;//amount paid
     int dollars;// dollars
     int quarters;// quarters
     int dimes;// dimes
     int nickels;// nickels
     int pennies;//pennies
     double change;// change

     System.out.print("Enter purchased:");// prompt
     purchased=input.nextDouble();// read purchased from user
     
     System.out.print("Enter paid:");// prompt
     paid=input.nextDouble();// read paid from user
     
     change = paid - purchase;
     dollars = (int) (change / 100.00);
     change = change - dollars * 100;
     quarters = (int)(change / 25);
     change = change - quarters * 25;
     dimes = (int)(change / 10);
     change = change - dimes * 10;
     nickels = (int)(change / 5);
     change = change - nickels * 5;
     pennies = (int)(change / 1);
     change = change - pennies;

     
     


     

     System.out.printf("dollars is %.2f\n",dollars);// display dollars

     System.out.printf("quarters is %.2f\n",quarters);// display quarters

     System.out.printf("dimes is %.2f\n",dimes);//display dimes

     
     System.out.printf("nickels is %.2f\n",nickels);//display nickels

     
     System.out.printf("pennies is %.2f\n",pennies);//display pennies

  } // end method main

}//end class DolQuaNicDimPen