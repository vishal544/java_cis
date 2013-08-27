// Programming assignment 5 Problem 3
// Program calculates factorials
import java.util.Scanner;// program uses class Scanner

public class Factorial {
   public static void main( String args[] )
   {


      int fact;
      int output=0;
      
      for ( int z = 1; z <= 5; z++ ) {
         fact = 1;

         for ( int w = 1; w <= z; w++ )
            fact *= w;

         output += "\n" + z + "\t" + fact;
      
       System.out.printf("%",output);
       }
      
   }
}

