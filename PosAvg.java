//Programming assignment 4 problem 4
//find average of the first 10 positive integers
import java.util.Scanner;//program uses class Scanner

public class PosAvg
{
  //main method begins execution of Java application
  public static void main(String args[])
  {
    // create Scanner to obtain input from command window
    Scanner input=new Scanner(System.in);

     double num; // number
     int count;// count
     double avg;//average
     double sum;// sum

     
    

     //initialization phase
     count=1;//initialize count
     sum=0;//initialize sum
     num=0;
     avg=0;
     

     

     

     //processing phase
     while(num>0)// eliminates negative numbers
     while(count<=10)//loop till count reaches 10
     {

     
     System.out.print("Enter number: ");// prompt
     num=input.nextDouble();// read number from user

     count=count=1;
     
     sum+=num;// add num to sum

     

     

     
     
     }// end while
     
     

     
     avg=sum/10;




     System.out.printf("avg is %f\n",avg);// display average


     

  } // end method main

}//end class PosAvg