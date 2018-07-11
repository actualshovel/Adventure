import java.util.Scanner;

public class CountingWhile
{
	public static void main(String[] args) 
	{
		Scanner kb = new Scanner(System.in);
		int times = 0;
		int n = 0;
		
		System.out.println("Type in a message, and I'll display it.");
		System.out.print("Message: ");
		String message = kb.nextLine();
		
		System.out.println("How many times?");
		System.out.print(">");
		times = kb.nextInt();
		
		while (n < times)
		{
			System.out.println( (n+1) + ". " + message );
			n++;
		}
	}
}