import java.util.Scanner;
public class CollatzSequence
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		int num, max = 0, steps = 0;
		
		System.out.print("Starting number: ");
		num = kb.nextInt();
		
		System.out.print(num + "\t");
		do {					//I use a "do" loop because we WILL need to run one of these decisions

			if ( num % 2 == 0 )	//if number is even
			{ 	
				num = num/2;
				System.out.print(num + "\t");
			}
			else				//if number is not even, then it's odd
			{
				num = (3 * num + 1);
				System.out.print(num + "\t");
			}
			
			if (num > max)		//max will change as long as "num" is larger
				max = num;		//max will NOT change if "num" is smaller. giving us highest value reached
			
			steps++;			//count each loop
		} while ( num != 1 );	//loop until we reach 1
		
		System.out.println("\n\nTerminated after " + steps + " steps. The highest value was " + max);	
	}
}//end class