//Programming assignment 1 problem 2
//Sum and Average of 3 numbers
import java.util.Scanner;//program uses class Scanner

public class SumAvg
{
  //main method begins execution of Java application
  public static void main(String args[])
  {
    // create Scanner to obtain input from command window
    Scanner input=new Scanner(System.in);

     int num1;// first number
     int num2;// second number
     int num3;// third number
     int sum;// sum of the three numbers
     double avg;//average of the three numbers

     System.out.print("Enter first number:");// prompt
     num1=input.nextInt();// read first number from user

     System.out.print("Enter second number:");// prompt
     num2=input.nextInt();// read second numberfrom user

     System.out.print("Enter third number:");// prompt
     num3=input.nextInt();// read third number from user

     sum=num1+num2+num3;

     avg=sum/3;

     System.out.printf("sum is %d/n",sum);// display sum

     System.out.printf("avg is %.2f/n",avg);// display avg


  } // end method main

}//end class SumAvg