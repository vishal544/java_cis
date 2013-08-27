//Programming assignment 3 problem 3
//Program that reads power of 10
import java.util.Scanner;//program uses class Scanner

public class TenPower
{
  //main method begins execution of java application
  public static void main(String args[])
  {
    // create Scanner to obtain input from command window
    Scanner input=new Scanner(System.in);
    
     int power;// power of ten
    
    
     System.out.print("Enter power of ten:");// prompt
     power=input.nextInt();// read number from user

     
     

     
    if (power==6)
    System.out.println("Million");

    else if(power==9)
    System.out.println("Billion");

    
    else if(power==12)
    System.out.println("trillion");

    
    else if(power==18)
    System.out.println("Quintillion");

    
    else if(power==21) 
    System.out.println("Sextillion");

    
    
    else if(power==30)
    System.out.println("Nonillion");

    
    
    else if(power==100)
    System.out.println("Googol");

     

     

     

    

   }// end main method
} //end class TenPower





    


    
