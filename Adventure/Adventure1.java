import java.util.Scanner;

public class Adventure1
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		String first, second, third;
		
		System.out.println("\nYou wake up in your room. Everything seems normal at first until you notice the door and windows are barred from the outside. You look around and everything is where it should be. You notice your \"phone\" and see your \"computer\". Which do \tyou grab?");
		System.out.print(">");
		first = kb.next();
		
		if (first.equalsIgnoreCase("phone")) 
		{
			System.out.println("\nYou pick up the phone and there is a crack on the screen, but it still apears to function normally. Do you want to check your \"messages\" or look at your recent \"calls\"?");
			System.out.print(">");
			second = kb.next();
			if (second.equalsIgnoreCase("messages"))
			{
				System.out.println("\nYikes! Some pretty emabrassing drunk texts... That would explain the punding headache. Will you browse through your \"apps\" or go back to bed?");
				System.out.print(">");
				third = kb.next();
				if (third.equalsIgnoreCase("apps"))
				{
					System.out.println("You play games on your phone and wonder if you will be able to use you basic java skills to make something like this one day.");
				}
				else if (third.equalsIgnoreCase("bed"))
					System.out.println("You get back to bed and attempt to sleep the pain away.");
				else
					System.out.println("You must still be drunk..");
			}
			else if (second.equalsIgnoreCase("calls"))
			{
				System.out.println("\nIn the call log is a lot of missed incoming calls from an unknown number Must've been really important. Do you want to \"return\" the call or \"throw\" your phone at the wall?");
				System.out.print(">");
				third = kb.next();
				if (third.equalsIgnoreCase("return"))
				{
					System.out.println("\nYou return the call and an automated female voice answers, speaking in what sounds to be Cantonese? It's the same calls you've been getting for weeks that you always hang up on. Oh well!");
				}
				else if (third.equalsIgnoreCase("throw"))
					System.out.println("You throw your phone at the wall, shattering it into a thousand pieces. Problem solved.");
				else
					System.out.println("That won't work.");
			}
			else 
				System.out.println("Invalid selection.");
		}
		if (first.equalsIgnoreCase("computer")) 
		{
			System.out.println("\nYou walk over to your PC which is already powered on. There are two windows that have been left open, your web \"browser\" and your steam \"chat\". What would you like to check?");
			System.out.print(">");
			second = kb.next();
			if (second.equalsIgnoreCase("browser"))
			{
				System.out.println("\nMultiple pages have been left open. Three tabs are \"study\" material, and the other contains a \"youtube\" video you haven't finished watching.");
				System.out.print(">");
				third = kb.next();
				if (third.equalsIgnoreCase("youtube"))
				{
					System.out.println("\nYou get lost in that weird part of YouTube again and forget what you were trying to do in the first place.");
				}
				else if (third.equalsIgnoreCase("study"))
					System.out.println("\nMight as well make the most of this time. You decide to study.");
				else 
					System.out.println("You stare blankly until sleep mode kicks in on the PC.");
				
			}
			else if (second.equalsIgnoreCase("chat"))
			{
				System.out.println("\nLooking at your chat you see you have been invited to play some Siege. Will you \"play\" the game or set your status to \"offline\" and pretend you're not at home?");
				System.out.print(">");
				third = kb.next();
				if (third.equalsIgnoreCase("play"))
				{
					System.out.println("\nYou decide to spend the rest of the day playing Siege.");
				}
				else if (third.equalsIgnoreCase("offline"))
					System.out.println("\nYou're not feeling very social. Better to just pretend to be offline right now and avoid confrontation.");
				else
					System.out.println("\nNo choice is made.");
				
				
			}
			else
				System.out.println("try again.");
		}
		
	
	}
}
			
