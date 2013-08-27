//Programming assignment 4 problem 5
//Print numbers from 1 to 100
import java.util.Scanner;//program uses class Scanner

public class PrintNum
{

   //main method begins execution of java application
   public static void main(String args[])
   {
    //create Scanner to obtain input from command window
    Scanner input=new Scanner(System.in);

    int num;// integer from 1 to 100
    
    

    //initialization phase
    num=0;// intialize number for counting
    

    //processing phase
    while(num<=99)// while num is less than or equal to 100
    { 

     ++num;// increment num


    System.out.printf("%d\t",num);// display num
    
    
    }// end while
   
    }//end main method

 }// end class PrintNum