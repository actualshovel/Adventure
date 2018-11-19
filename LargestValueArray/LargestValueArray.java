package programByDoing;
import java.util.Random;

public class LargestValueArray {

	public static void main(String[] args) {
		Random r = new Random();
		//create an array to hold 10 values
		int myArray[] = new int[10];
		
		System.out.print("Array: ");
		//put a random number in each slot
		for (int i = 0; i < myArray.length; i++)
		{
			myArray[i] = 1 + r.nextInt(100);
			System.out.print(myArray[i] + " ");
		}
		
		
		//loop through each slot in the array
		int max = 0;
		for (int i = 0; i < myArray.length; i++)
		{
			//if the current number is greater than "max"
			if (myArray[i] > max)
				//then current number is now the max
				max = myArray[i];
		}
		//display largest number in array
		System.out.println("\n" + max + " is the largest number.");

	}
}
