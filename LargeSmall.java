//Programming assignment 4 problem 3
//read double numbers till -9999 is typed
import java.util.Scanner;//program uses class Scanner

public class LargeSmall
{
  //main method begins execution of Java application
  public static void main(String args[])
  {
    // create Scanner to obtain input from command window
    Scanner input=new Scanner(System.in);

     double num; // number
     double numlarge;// largest number
     double numsmall;// smallest number
    

     //initialization phase
     numlarge=num;//initialize largest number
     numsmall=num;//initialize smallest number
     

     //processing phase
     while(num!=-9999)//loop till -9999 is typed
     {

     System.out.print("Enter number: ");// prompt
     num=input.nextDouble();// read number from user

     numlarge=num>numsmall;

     numsmall=num<numlarge;
     





     System.out.printf("numlarge is %f\n",numlarge);// display largest number

     System.out.printf("numsmall is %f\n",numsmall);// display smallest number

     
     }// end while

  } // end method main

}//end class LargeSmall