//Programming assignment 3 problem 2
//Java coffee shop earnings
import java.util.Scanner;//program uses class Scanner

public class JavaCoffee
{
  //main method begins execution of java application
  public static void main(String args[])
  {
    // create Scanner to obtain input from command window
    Scanner input=new Scanner(System.in);
    
    double sales;// sales
    double hours;//hours worked
    double wage;// wage
    double comm;// commision
    double rate=7.25;

    
     System.out.print("Enter hours worked:");// prompt
     hours=input.nextDouble();// read number from user

     
     System.out.print("Enter sales:");// prompt
     sales=input.nextDouble();// read number from user

     if (sales<100)
     comm=sales*0.05;

     else if(sales<300)
     comm=sales*0.1;

     else 
     comm=sales*0.15;

     if (hours<40)
     wage=(hours*rate)+comm;

     else 
     wage=(hours-40)*(rate*1.5)+(40*rate)+comm;

     System.out.printf("wage is %.2f\n", wage);// dispaly wage

     

     

    

   }// end main method
} //end class JavaCoffee





    


    
