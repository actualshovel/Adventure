package programByDoing;
import java.util.Scanner;
import java.util.Arrays;

public class Hangman {

	public static void main(String[] args) {
		//initialize array of chars with secret word
		char word[] = { 'c', 'h', 'r', 'i', 's', 't', 'm', 'a', 's' };
		char blank[] = { '_', '_', '_', '_', '_', '_', '_', '_', '_' };
		
		//need a way to keep track of all incorrect guesses
		StringBuilder misses = new StringBuilder("");
		
		int wrong = 0;
		char guess;
		
		//loop until wrong 5 times
		do {
			System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
			
			boolean right = false;
			System.out.print("Word: ");
			//display blank "_" chars, to be filled in as user plays the game
			for (int i=0; i<blank.length; i++) {
				System.out.print(blank[i]);
			}
			System.out.println("\nMisses: " + misses);
			System.out.print("\nGuess: ");
			guess = getInput();
			
			//compare "guess" with each char in the word
			for (int i=0; i<word.length; i++) {
				if (guess == word[i]) {
					//if an answer is found, fill in a blank "_" spot
					blank[i] = word[i];
					right = true; }
				}
			
			//incorrect guess adds to the counter, and keeps track of missed char
			if (right !=true) {
				wrong++;
				misses.append(guess); }
			
			//when word is guessed
			if (Arrays.equals(word, blank) ) {
				System.out.println("You got it!");
				break; }
		}while(wrong<5);
		
		if (wrong == 5)
			System.out.println("You're out of guesses!");
	}
	
	
		static char getInput() {
		Scanner kb = new Scanner(System.in);
		char guess = kb.next().charAt(0);
		return guess;
	}
}
