//Programming assignment 4 problem 1
//Sum of integers from 1 to 100
import java.util.Scanner;//program uses class Scanner

public class SumInt
{

   //main method begins execution of java application
   public static void main(String args[])
   {
    //create Scanner to obtain input from command window
    Scanner input=new Scanner(System.in);

    int num;// integer from 1 to 100
    
    int sum;//sum of integers from 1 to 100

    //initialization phase
    num=1;// intialize number to 1 for counting
    sum=0;//initialize sum to 0 for totaling

    //processing phase
    while(num<=100)// while num is less than or equal to 100
    { 
     sum+=num;// add integer to sum

     ++num;// increment num

    }// end while

    System.out.printf("sum is %d\n", sum);// display sum
   
    }//end main method

 }// end class SumInt