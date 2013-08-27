import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Formatter;
import java.util.HashMap;


  public class NameArray1
  {
    // create a new arraylist of strings
    Map<String, String, String> name= new HashMap< String, String, String>();

    
    
      Scanner input=null;
      Formatter output= null;
      

     public  NameArray1()
     {
      
  
       try
       {
         input=new Scanner (new File("data.txt"));
         
       }
       catch (FileNotFoundException fileNotFoundException)
       {
         System.out.println("Error Opening File.");
         System.exit(1);
       }
       

       while(input.hasNext())
       {
         String info = input.nextLine();
         
         String line[] = info.split("\t");
         name.put( line[0],line[1],line[2]);
       }

      
     
       
       
     
       
        
       public boolean  search( String ssn)
       {
        return name.containsKey(ssn);
       }
        
       
        

       

 }

}  
    
    