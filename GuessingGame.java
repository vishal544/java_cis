//Programming Assignment 7 Problem 2

import java.util.Scanner;
public class GuessingGame
{
public static void main(String[] args)
{
Scanner keyboard = new Scanner(System.in); //User input
int x = (int)(1000 * Math.random()) + 1; //Generates random number
int userInput = 0; //user input number
char userAns1_1;
boolean yes = true;

System.out.print("Do you want to play a game: ");
String userAns1 = keyboard.nextLine();
userAns1_1 = userAns1.charAt(0); 

while (yes == true)
{
char userAns2 = 'y'; //Compare to Yes or No answer from user

if (userAns1_1 != userAns2)
{
System.out.println("Goodbye!");
yes = false;
}
else
{
System.out.println("\nI am thinking of a number between 1 and 1000. Try to guess it.\n");

while (x != userInput)
{
System.out.print("What's your guess? ");
userInput = keyboard.nextInt();

if (x < userInput)
{
System.out.println(userInput + " is too big");
}

else if (x > userInput)
{
System.out.println(userInput + " is too small");
}

  }
     }
