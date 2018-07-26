import java.util.Scanner;
import java.util.Random;
public class BlackJack
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("***You get two cards. You may 'hit' to draw another card. Closest player to 21 without going over wins.***");
		
		String decision;
		int c1, c2, d1, d2, playerTotal, dealerTotal;
		
		
		//player draws 2 cards, total is added and displayed
		timeDelay(1200);
		c1 = hit();
		c2 = hit();
		playerTotal = c1+c2;
		System.out.println("You draw " +c1+ " and " +c2);
		System.out.println("You have " + playerTotal);
		
		//dealer draws 2 cards, totals are added, 1 is displayed
		timeDelay(1200);
		d1 = hit();
		d2 = hit();
		dealerTotal = d1 + d2;
		System.out.println("\nDealer draws a " +d1+ " and one hidden card.");
		
		do {
		System.out.println("Do you choose to 'hit' or 'stay'?");
		System.out.print(">");
		decision = kb.next();
		
		//if player wants another card
		if (decision.equalsIgnoreCase("hit") ) {
			c1 = hit();
			timeDelay(600); //brief pause
			
			System.out.println("\nYou draw a " +c1);
			playerTotal += c1;
			System.out.println("Your total is now " + playerTotal); }
		
		//when player is saisfied with cards
		else
			System.out.println("You decide to keep " + playerTotal);
			timeDelay(600);
		
		} while ( decision.equalsIgnoreCase("hit") && playerTotal < 21 );
		//end player phase loop
		
		//dealer phase
		//reveal other dealer card
		System.out.println("\nDealer's cards are " + d1 + " and " + d2 + "\nfor a total of " + dealerTotal);
		System.out.println("--------------------");
		timeDelay(1000);
		
		//skip dealer hit if player bust
		if ( playerTotal > 21)
			System.out.println("You bust! Dealer wins.");
		
		//player didn't go over 21; dealer hits
		//dealer must draw if 16 or lower, up to 21
		else {
			while ( dealerTotal <= 16 && dealerTotal <= 21 ) {
				d1 = hit();

				System.out.println("Dealer draws a " + d1);
				dealerTotal += d1;
				System.out.println("Dealer now has " + dealerTotal);
				timeDelay(1300); //brief pause
			} //end dealer hit loop	
			
			System.out.println("*******************");
			timeDelay(1000);
			System.out.println("\nYou have: " + playerTotal + "\nDealer has: " +dealerTotal);
		
			if ( dealerTotal >= playerTotal && dealerTotal <=21 )
				System.out.println("The House always wins...");
			else
				System.out.println("You win this time...");
		} //end of "player-didnt-bust" conditional
		
	}
	
	public static int hit() //call this everytime a card is drawn
	{
		Random r = new Random();
		int newCard = r.nextInt((11 - 2) + 1) + 2;
		return newCard;
	}
	
	public static void timeDelay(int t) //delay method for readability while playing. keeps try/catch from making main() look messy
	{
		try {
			Thread.sleep(t);
		} catch (InterruptedException e) {}
	}
}
