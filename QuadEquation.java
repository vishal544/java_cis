//Programming assignment 2 problem 4
//quadratic equation
import java.util.Scanner;//program uses class Scanner

public class QuadEquation
{
   //main method begins execution of java application
  public static void main(String args[])
  {
    // create Scanner to obtain input from command window
    Scanner input=new Scanner(System.in);
    
    double a;// A
    double b;// B
    double c;// C
    double x1;// x1
    double x2;// x2

     System.out.print("Enter a:");// prompt
     a=input.nextDouble();// read number from user

     
     System.out.print("Enter b:");// prompt
     b=input.nextDouble();// read number from user

     
     
     System.out.print("Enter c:");// prompt
     c=input.nextDouble();// read number from user

     x1=-b+Math.sqrt(Math.pow(b,2)-4*a*c)/(2*a);
     x2=-b-Math.sqrt(Math.pow(b,2)-4*a*c)/(2*a);


     System.out.printf("x1 is %.2f\n",x1);// display x1

     System.out.printf("x2 is %.2f\n",x2);//display x2
   }// end method main
}//end class QuadEquation
