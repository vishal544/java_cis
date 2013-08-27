//Programming assignment 3 problem 1
//Read score and display letter grade
import java.util.Scanner;//program uses class Scanner

public class ScoreGrade
{
  //main method begins execution of java application
  public static void main(String args[])
  {
    // create Scanner to obtain input from command window
    Scanner input=new Scanner(System.in);
    
    double score;// score

    if ( score >=90)
    System.out.println("Grade=A");

    else if (score >=80)
    System.out.println("Grade=B");

    else if (score >=70)
    System.out.println("Grade=C");

    else if (score >=60)
    System.out.println("Grade=D");

    else  
    System.out.println("Grade=F");

    

   }// end main method
} //end class ScoreGrade





    


    
