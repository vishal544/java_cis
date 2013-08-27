//Programming assignment 3 problem 4
//Read year and print in roman numeral
import java.util.Scanner;//program uses class Scanner

public class RomanYear
{
  //main method begins execution of Java application
  public static void main(String args[])
  {
    // create Scanner to obtain input from command window
    Scanner input=new Scanner(System.in);

     int num;// four digit number
     int num1;// first digit
     int num2;// second digit
     int num3;// third digit
     int num4;// fourth number
     
     
     

     System.out.print("Enter year:");// prompt
     num=input.nextInt();// read year from user


     num1= num / 10000;
     num= num%10000;
     num2= num / 1000;
     num=num%1000;
     num3= num / 100;
     num=num%100;
     num4=num/10;
     num=num%10;
     

    
     
     
   

     

     System.out.printf("num is %num1, %num2, %num3, %num4",num);// display num

     


  } // end method main

}//end class RomanYear