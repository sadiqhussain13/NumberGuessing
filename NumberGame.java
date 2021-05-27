import java.util.Scanner;

public class NumberGame
{
	private static void pause(int milliseconds)
	{
		try
		{
			Thread.sleep(milliseconds);
		}
		catch(Exception e)
		{

		}
	}
	public static void main(String args[])
	{
	        boolean gameOver=false;

		//Introduction
		System.out.println("Welcome to the Number guesser game!");
		pause(1500);
		System.out.println("Try and guess the number between 1 and 100");
		pause(1500);

		//Pick a random number between 1-100 inclusive
		System.out.println("Picking a random number now...");
		pause(2500);
		System.out.println("3...");
		pause(2500);
		System.out.println("2..");
		pause(2500);
		System.out.println("1.");
		pause(3000);
		int randomNumber = (int)(Math.random()*100)+1;
		System.out.println("Number Chosen!");
		pause(1100);

		//Ask the user for their guess
		Scanner input = new Scanner(System.in);
		while(!gameOver)
		{	System.out.println("Please input your guess: ");
			int guess = input.nextInt();
		
		//Check if it is the right number or if it is high or low
			if(guess == randomNumber)
			{
				gameOver = true;
			}
		//Tell the user
			else if(guess < randomNumber)
			{
				System.out.println("Your guess is too low!");
			}
			else if(guess > randomNumber)
			{
				System.out.println("Your guess is too high!");
			}
		} //Repeat until the correct number is found
		
		//Congratulate on winning!
		System.out.println("Congratulation you guessed the right number!" + randomNumber);
	}
}