package programByDoing;
import java.util.Random;

public class BasicArrays3 {

	public static void main(String[] args) {
		Random r = new Random();
		int myArray[] = new int[1000];

		
		for (int i = 0; i < myArray.length; i++)
		{
			myArray[i] = 10 + r.nextInt(99);
			System.out.print(myArray[i] + "  ");
		}

	}

}
