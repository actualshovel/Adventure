package programByDoing;
import java.util.Random;

public class BasicArrays2 {

	public static void main(String[] args) {
		Random r = new Random();
		int myArray[] = new int[10];
		
		for (int i = 0; i < myArray.length; i++)
		{
			myArray[i] = 1 + r.nextInt(100);
			System.out.println("Slot " + i + " contains a " + myArray[i]);
		}
		
		System.out.println("\nThe first number is now stored even after the loop. It is " + myArray[0]);

	}
}
