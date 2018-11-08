package programByDoing;
import java.util.Scanner;

public class Refresher {

	public static void main(String[] args) {
		System.out.print("What is your name: ");
		Scanner kb = new Scanner(System.in);
		
		String name = kb.next();
		kb.close();
		
		if (name.equalsIgnoreCase("mitchell") )
		{
			repeat(5, name);
		}
		else
		{
			repeat(10, name);
		}

	}
	
	public static void repeat(int times, String name)
	{
		for (int i = 0; i < times; i++ )
				{
			System.out.println(name);
				}
	}

}
