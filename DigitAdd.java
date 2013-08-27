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


     System.out.print("Enter Integer:");// prompt
     num=input.nextInt();// read five digit number from user


     (int a){
      int z;
      int s = 0;
      z = a %10;
      s = z + s;
      while(a > 0){
        a = a / 10;
        s = s + a;
      }
    return s;
  }
   

     

     System.out.printf("sum is %d/n",sum);// display sum

     


  } // end method main

}//end class DigitAdd