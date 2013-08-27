import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Formatter;
import java.util.HashMap;


  public class NameArrayHash
  {
    // create a new arraylist of strings
    Map<String, String> name= new HashMap< String, String>();

    
    
      Scanner input=null;
      Formatter output= null;
      

     public  NameArrayHash()
     {
      
  
       try
       {
         input=new Scanner (new File("PhoneTxt.txt"));
         output = new Formatter("NewFile.txt");
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
         name.put( line[0],line[1]);
       }

      }
     
       public void add(String newName,String phone)
       {
        name.put(newName, phone);
       }

       public void rename( String oldName,String newName, String newPhone)
       {
        name.remove(oldName);
        name.put(newName,newPhone);
       }
     
       public String getNumber(String name1)
       {
        return name.get(name1);
       }
        
       public boolean  search( String searchName)
       {
        return name.containsKey(searchName);
       }
        
       
        

       public void displayMap()
       {
        Set < String> keys = name.keySet();
        TreeSet<String> sortedKeys= new TreeSet<String>(keys);

        for (String key:sortedKeys)
        {
   

        System.out.printf("\n%s\t%s\n",key,name.get(key));
        output.format("\n%s\t%s\n",key,name.get(key));
        }
       output.close();

       }

 }

  
    
    