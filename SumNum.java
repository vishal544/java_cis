//Programming assignment 5 problem 1
//Read an integer and find the sum of the digits
import java.util.Scanner;//program uses class Scanner

public class SumNum
{
  //main method begins execution of Java application
  public static void main(String args[])
  {
    // create Scanner to obtain input from command window
    Scanner input=new Scanner(System.in);




      int a;// integer
      int z;// digit
      int sum = 0;// sum
      


      
     System.out.print("Enter Integer:");// prompt
     a=input.nextInt();// read five digit number from user

      z = a %10;

      sum = z + sum;

      while(a > 0)
      {
        a = a / 10;
        sum = sum + a;
      }
    

     

     System.out.printf("sum is %d",sum);// display sum

     


  } // end method main

}//end class DigitAdd