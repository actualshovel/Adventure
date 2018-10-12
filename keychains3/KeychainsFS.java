import java.util.Scanner;
public class KeychainsFS {

	public static void main(String[] args) 
	{
		//initialize menu choice, keychain total, additional shipping cost
		int selection = 0;
		int chains = 0;
		int quantityShip = 1;
		//initialize base price total, sales tax, base shipping
		double price = 0;
		double tax = .0825;
		double shipping = 5.0;
		
		System.out.println("Welcome to the keychain shop!");
		System.out.println("Each keychain is $10. Base shipping is $5 + $1 for each additional keychain.");
			
		while ( selection != 4 ) 	//loop until checkout
		{
			System.out.println("\n1. Add Keychains to Order\n2. Remove Keyhains from Order\n3. View Current Order\n4. Checkout");
		
			System.out.print("\nPlease enter your choice: ");
			selection = getInput();
		
			switch (selection) {
			case 1: chains = add_keychains(chains);		//base total keychains sent "add" method for calculation
					System.out.println("You now have " + chains + " keychains.");
				break;
			case 2: chains = remove_keychains(chains);	//same with subtraction method
					System.out.println("You now have " + chains + " keychains. ");
				break;
			case 3: view_order(price, chains, tax, shipping, quantityShip);
				break;
			case 4: checkout(price, chains, tax, shipping, quantityShip);
				break;
			default: System.out.println("Invalid input. Please choose 1 - 4");
				break; 		}
			price = ( chains * 10 );					//calculate base price before loop restart
		}		//end loop
		
	}
	
	private static void view_order(double currentPrice, int currentChains, double baseTax, double baseShip, int perShip) { 
			//calculate shipping and sales tax independently
		double totalShip = ( baseShip + currentChains * perShip );
		double orderTax = ( baseTax * currentPrice );
			//calculations are done as message is displayed
		System.out.println("\nYou have " + currentChains + " keychains.");
		System.out.println("Keychains cost $10 each.");
		System.out.println("Shipping: $" + totalShip );
		System.out.println("Amount before tax: $" + (currentPrice + totalShip) );
		System.out.println("Tax on the order: $" + orderTax);
		System.out.println("Amount due: $" + ( currentPrice + totalShip + orderTax ) );
	}

	private static void checkout(double currentPrice, int currentChains, double baseTax, double baseShip, int perShip) {
			//I need a new scanner object for String input
		Scanner userinput = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = userinput.next();
		view_order(currentPrice, currentChains, baseTax, baseShip, perShip);		
		
		System.out.println("Thanks for shopping, " + name + "!");
	}

	private static int remove_keychains(int total) {
		int newTotal = total;
		System.out.print("\nYou have " + total + " keychains. How many to remove? ");
		int remove = getInput();
		
			//check for negative total keychains
			if ( remove > total )
				System.out.println("Cannot remove that many.");
			else
				newTotal = total - remove;
		return newTotal;
	}

	private static int add_keychains(int total) {
		System.out.print("\nYou have " + total + " keychains. How many to add? ");
		int newTotal = total + getInput();
		return newTotal;
	}
	
	public static int getInput()
	{
		Scanner kb = new Scanner(System.in);
		int num = kb.nextInt();
		return num;
	}
}