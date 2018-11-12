package programByDoing;
import java.util.Scanner;

class MoreNumberPuzzles {	
	public static void main(String[] args) {
		
		int choice = 0;
		
		do
		{
			//show menu. choose between 2 functions, or quit
			System.out.println("1) Find two digit numbers <= 56 with sums of digits > 10");
			System.out.println("2) Find two digit number minus number reversed which equals sum of digits");
			System.out.println("3) Quit");
			System.out.print("\n>");
			
			choice = getInput();
			
			if (choice == 1)
				firstOption();
			else if (choice == 2)
				secondOption();
			else
				System.out.println("Goodbye!");
		} while (choice != 3);
	}

	private static void firstOption() {
		//first digit
		for (int a = 1; a <= 5; a++)
		{
			//second digit
			for (int b = 0; b <= 9; b++)
			{
				if (a + b > 10 )
					System.out.println(a + "" + b);
				//according to the assignment, we only want to count to 56. this breaks out of the loop when that number is reached
				if( a == 5 && b == 6)
					break;
			}
		}
		System.out.println();
	}

	private static void secondOption() {
		System.out.print("Enter a two-digit number: ");
		int num = getInput();
		
		int last = num % 10;
		int first = num / 10;
		int backward = (last*10) + first;
		
		if (num - backward == first + last)
			System.out.println(num + " - " + backward + "is the same as " + first + " + " + last);
		else
			System.out.println("False\n");
	}
	
	
	private static int getInput() {
		Scanner kb = new Scanner(System.in);
		int num = kb.nextInt();
		return num;
	}
	
	/* unused function to reverse 2 digit integer
	 * i leave this out because i do not want to also use it
	 * to add the digits individually.
	 * i will save this algorithm however for future use
	private static int reverseNumber(int forward) {
		int last = forward % 10;
		int first = forward / 10;
		int backward = (last*10) + first;
		return backward;
	} */
}
