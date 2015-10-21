import java.util.Random;
import java.util.Scanner;
import java.io.*;

public class SHartleyLab07Guessing {

	public static void main(String[] args) throws IOException{
		Random randomnumber = new Random();
		int NumberToGuess = randomnumber.nextInt(100);
		int Tries = 0;
		int guess;
		String name;
		
		// Scanner
		Scanner keyboard = new Scanner (System.in);
		
		// Print Writer
		PrintWriter pw = new PrintWriter(new FileOutputStream(new File("R:\\output\\Shartley_SuperGuesser.txt"),true));
		
		// Boolean Variable
		boolean win = false;
		
		// Ask For Name
		System.out.println("Please enter your name.");
		name = keyboard.nextLine();

		
		// Game's Main Code
		while (win == false){
			
			System.out.println("Guess a number between 1 and 100");
			guess = keyboard.nextInt();
			Tries++;
			
			if (guess == NumberToGuess) {
				win= true;
			}
			
			else if (guess < NumberToGuess){
			System.out.println("Too Low, try again");
			
			}
			
			else if (guess > NumberToGuess){
			System.out.println("Too High, try again");
			
			}
		}
		
		// Various Outputs
		System.out.println("You have won!");
		System.out.println("The number was " +NumberToGuess);
		System.out.println("It took you " + Tries + " tries to guess the correct number");
		
		//Output To File
		pw.println( name +  "Guessed the number, " +NumberToGuess+ " in " +Tries+ " tries ");

		
		// Close The Scanner
		keyboard.close();

	}
}
