//Programming assignment 2 problem 6
//Trip Calculator
import java.util.Scanner;//program uses class Scanner

public class TripCalc
{
   //main method begins execution of java application
  public static void main(String args[])
  {
    // create Scanner to obtain input from command window
    Scanner input=new Scanner(System.in);

    double miles;// miles travelled
    double parking;// parking rate rate
    double tolls;// bridge toll
    double gas;// gas price
    double total;// total

    
     System.out.print("Enter miles travelled:");// prompt
     miles=input.nextDouble();// read number from user

     
     System.out.print("Enter parking:");// prompt
     parking=input.nextDouble();// read number from user

     tolls=4;
     
     System.out.print("Enter gas price:");// prompt
     gas=input.nextDouble();// read number from user

     
     total=(miles*gas/20)+parking+tolls;

     

     System.out.printf("tota is %.2f\n",total);// display total

     

   }// end method main
}//end class TripCalc

      