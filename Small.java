// Programming assignment 5 problem 2
// Program finds the smallest of several integers
import java.util.Scanner;//program uses class Scanner

public class Small {

   public static void main( String args[] )
   {
    
    // create Scanner to obtain input from command window
    Scanner input=new Scanner(System.in);

      int smallest = 0;
      int temp = 0;
      int number;

      
     System.out.print("Enter Number of Integers:");// prompt
     number=input.nextInt();// read number from user

      

      if ( number == 0 )
         System.exit( 0 ); 
        
      for ( int x = 1; x <= number; x++ ) {  
         
      System.out.print("Enter integer:");// prompt
      temp=input.nextInt();// read number from user 

      
         
         if ( x == 1 ) 
            smallest = temp; 
         else if ( temp < smallest )
            smallest = temp;
      }

      System.out.printf("Smallest integer is %d",smallest);// display smallest integer


      
   }
}