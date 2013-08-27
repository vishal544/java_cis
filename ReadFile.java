import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

import java.util.Formatter;
public class ReadFile
{
 public static void main( String args[])

 {

  Scanner input=null;

  Formatter output=null;

  People peoples[] = new People [10];
  int id;
  String fName,lName;
  int age;
  int counter = 0;
  try
  {
  
      input=new Scanner(new File ("Student.txt"));

      output= new Formatter( "file.txt");
  }
  catch (FileNotFoundException fileNotFoundException ) 
  {
  
  }
   while (input.hasNext())
    {
      id=input.nextInt();
      fName=input.next();
      lName=input.next();
      age=input.nextInt();
      People P = new People( id, fName, lName, age);
      peoples [counter++] = P;
     }


  for (int i=0;i<counter;i++)
  {

  System.out.printf ("%s\n",peoples[i].toString());
  
  output.format ("%s\n",peoples[i].toString());
    }
  output.close();

 }
}

  