package programByDoing;
import java.util.Scanner;

public class displayMultiples {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Choose a number: ");
		int num = kb.nextInt();
		
		for (int i = 1; i <= 12; i++)
		{
			System.out.println(num + "x" + i + " = " + (num * i) );
		}

	}

}
