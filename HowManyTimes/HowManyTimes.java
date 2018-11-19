package programByDoing;
import java.util.Random;
import java.util.Scanner;

public class HowManyTimes {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner kb = new Scanner(System.in);
		int myArray[] = new int[10];
		
		System.out.print("Array: ");
		for (int i = 0; i < myArray.length; i++)
		{
			myArray[i] = 1 + r.nextInt(50);
			System.out.print(myArray[i] + " ");
		}
		System.out.print("\nNumber to find: ");
		int find = kb.nextInt();
		
		int counter = 0;
		for (int i = 0; i < myArray.length; i++)
		{
			if (find == myArray[i])
				counter++;
		}
		
		System.out.println(find + " was found " + counter + " times.");

	}
}
