//Programming assignment 2 problem 2
//Read and display first and last name
import java.util.Scanner;//program uses class Scanner

public class FirstLastName
{
  //main method begins execution of java application
  public static void main(String args[])
  {
    // create Scanner to obtain input from command window
    Scanner input=new Scanner(System.in);
    
    String firstName,lastName,result;

    System.out.print("Enter First Name:");// prompt
    firstName=input.nextLine();// read first name from user

    System.out.print("Enter Last Name:");//prompt
    lastName=input.nextLine();// read last name from user

    System.out.printf("%s, %s\n"lastName,firstName);
   }// end main method
} //end class FirstLastName





    


    
