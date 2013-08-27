
import java.util.Scanner;

public class NamePhoneAppTest
{
    public static void main(String[] args)
    {
        String oldName;
        
       
        String addName;
        String addPhone;
        String renameName;
        String renamePhone;
        String searchName;
        Scanner input = new Scanner(System.in);
        char ans = 'a';
        String answer;
        String buffer;
        
        
        
        NameArrayHash names = new NameArrayHash();
        
        do {
            System.out.println("Hello, how would you like to modify your array?");
            System.out.println("a) Add name and phone to the array");
            System.out.println("b) Rename someone in the array");
            System.out.println("c) Check if a name exists in the array");
            System.out.println("d) Exit the program");

            answer = input.nextLine();
            ans = answer.charAt(0);
            
            if(ans == 'a') {
                System.out.println("Enter the name you wish to add: ");
                addName = input.nextLine();
                System.out.println("Enter the phone number you wish to add to that name: ");
                addPhone = input.nextLine();
                names.add(addName, addPhone);
            }
            else if(ans == 'b') {
                System.out.println("Enter the name of the name you wish to rename: ");
                oldName = input.nextLine();
                System.out.println("Enter the new name: ");
                renameName = input.nextLine();
                System.out.println("Enter the new Phone: ");
                renamePhone = input.nextLine();
                names.rename(oldName, renameName, renamePhone);
            }
            else if(ans == 'c') {
                System.out.println("Enter the name you wish to search for: ");
                searchName = input.nextLine();
                if(names.search(searchName) == true)
                    System.out.println(searchName + "'s phone number is " + names.getNumber(searchName));
                else
                    System.out.println(searchName + " isn't in the Array!");
            }
            else
                names.displayMap();
            
        } while(ans == 'a' || ans == 'b' || ans == 'c');
        
        
       
       
        
    }
           
}