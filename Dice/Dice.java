import java.util.Random;
public class Dice
{
	public static void main(String[] args)
	{
		Random r = new Random();
		int roll_1 = 1 + r.nextInt(6);
		int roll_2 = 1 + r.nextInt(6);
		int total = (roll_1 + roll_2);
		
		while ( roll_1 != roll_2)	
		{	
		roll_1 = 1 + r.nextInt(6);
		roll_2 = 1 + r.nextInt(6);
		total = (roll_1 + roll_2);
		
		System.out.println("Roll #1: " + roll_1);
		System.out.println("Roll #2: " + roll_2);
		System.out.println("The total is: " + total + "!\n");
		
		
		}
	}
}