//Programming assignment 3 problem 5
//Expressimo Delivery Serice
import java.util.Scanner;//program uses class Scanner

public ExpressDelivery
{
  //main method begins execution of java application
  public static void main(String args[])
  {
    // create Scanner to obtain input from command window
    Scanner input=new Scanner(System.in);
    
    double weight;// weight of package
    int type;//type of package
    int service;//type of service
    double charge;// charge for shipping
    

    
     System.out.print("Enter package weight:");// prompt
     weight=input.nextDouble();// read weight from user

     
     System.out.print("Enter 1 for letter or 2 for box:");// prompt
     type=input.nextInt();// read type of package from user

     System.out.print("Enter 1 for priority or 2 for standard or 3 for two day:");// prompt
     service=input.nextInt();// read type of service from user

     if (type==1,service==1)
     charge=12.00;

     else if(type=1,serice==2)
     charge=10.50;


     System.out.printf("charge is %.2d\n", charge);// display charge

     

     

    

   }// end main method
} //end class ExpressDelivery





    


    
