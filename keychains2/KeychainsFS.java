import java.util.Scanner;
public class KeychainsFS {

	public static void main(String[] args) 
	{
		int selection = 0;
		int chains = 0;
		int price = 0;
		
		System.out.println("Welcome to the keychain shop!");
			
		while ( selection != 4 ) 
		{
			
			System.out.println("\n1. Add Keychains to Order\n2. Remove Keyhains from Order\n3. View Current Order\n4. Checkout");
		
			System.out.print("\nPlease enter your choice: ");
			selection = getInput();
		
			switch (selection) {
			case 1: chains = add_keychains(chains);
					System.out.println("You now have " + chains + " keychains.");
				break;
			case 2: chains = remove_keychains(chains);
					System.out.println("You now have " + chains + " keychains. ");
				break;
			case 3: view_order(price, chains);
				break;
			case 4: checkout(price, chains);
				break;
			default: System.out.println("Invalid input. Please choose 1 - 4");
				break; 		}
			price = ( chains * 10 );
		}
		
	}
	
	
	private static void view_order(int currentPrice, int currentChains) {
		System.out.println("\nYou have " + currentChains + " keychains.");
		System.out.println("Keychains cost $10 each.");
		System.out.println("Total cost is $" + currentPrice + ".");
		
	}

	private static void checkout(int currentPrice, int currentChains) {
		Scanner userinput = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = userinput.next();
		
		System.out.println("\nYou have " + currentChains + " keychains.");
		System.out.println("Keychains cost $10 each.");
		System.out.println("Your total today is " + currentPrice + ".");
		System.out.println("Thanks for shopping, " + name + "!");
		
	}

	private static int remove_keychains(int totalSub) {
		System.out.print("\nYou have " + totalSub + " keychains. How many to remove? ");
		int newTotal = totalSub - getInput();
		return newTotal;
		
	}

	private static int add_keychains(int totalAdd) {
		System.out.print("\nYou have " + totalAdd + " keychains. How many to add? ");
		int newTotal = totalAdd + getInput();
		return newTotal;
	}
	
	public static int getInput()
	{
		Scanner kb = new Scanner(System.in);
		int num = kb.nextInt();
		return num;
	}

}