import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

  public class NameArray
  {
    // create a new arraylist of strings
    ArrayList<String> Names = new ArrayList<String>();
    
    

     public  NameArray()
     {

      Scanner input=null;
  
       try
       {
         input=new Scanner(new File ("NameList.txt"));
       }
       catch (FileNotFoundException fileNotFoundException)
       {
         System.out.println("Error Opening File.");
         System.exit(1);
       }
       

       while (input.hasNext())
       {
        String n = input.nextLine();
        Names.add (n);
       }

      }


     public void toPrint()
     {
       for (String item:Names)
       System.out.printf("%s\n",item);
     }
 }

  
    
    