//Programming assignment 1 problem 4
//Conversion from fahrenheit to celcius
import java.util.Scanner;//program uses class Scanner

public class FahCel
{
  //main method begins execution of Java application
  public static void main(String args[])
  {
    // create Scanner to obtain input from command window
    Scanner input=new Scanner(System.in);

     double fah;// fahrenheit
     double cel;// celcius
     

     System.out.print("Enter fahrenheit:");// prompt
     fah=input.nextDouble();// read number from user

     cel=(fah-32)/9*5;


     System.out.printf("celsius is %.2f\n",cel);// display cel



  } // end method main

}//end class FahCel