import java.util.Scanner;

public class NameArray1Test
{

	public static void main(String[]args)
           {
                System.out.println("Enter the ssn you wish to search for: ");
                searchName = input.nextLine();
                if(names.search(searchName) == true)
                    System.out.println(searchName + "'s ssn is " + names.getssn(searchSsn));
                else
                    System.out.println(searchName + " isn't in the Array!");
            }
}