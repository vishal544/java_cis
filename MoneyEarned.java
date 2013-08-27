//Programming assignment 2 problem 5
//quadratic equation
import java.util.Scanner;//program uses class Scanner

public class MoneyEarned
{
   //main method begins execution of java application
  public static void main(String args[])
  {
    // create Scanner to obtain input from command window
    Scanner input=new Scanner(System.in);
 

    
    double p;// principal
    double r;// rate
    double n;// years
    double result;// result

     System.out.print("Enter p:");// prompt
     p=input.nextDouble();// read number from user

     
     System.out.print("Enter r:");// prompt
     r=input.nextDouble();// read number from user

     
     
     System.out.print("Enter n:");// prompt
     n=input.nextDouble();// read number from user



     result=p*Math.pow(1+r/100,n);

    System.out.printf("result is %.2f\n",result);//display result


   }// end method main
}//end class MoneyEarned