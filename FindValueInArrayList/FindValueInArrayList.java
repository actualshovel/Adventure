import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class FindValueInArrayList {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner kb = new Scanner(System.in);
		ArrayList<Integer> myList = new ArrayList<Integer>();
		//add random ints 1-50
		for (int i=0; i<10; i++)
			myList.add(1 + r.nextInt(50) );
		
		//display ArrayList
		for (int display : myList)
			System.out.print(display + " ");
		
		System.out.println("\nType a number to find ");
		System.out.print(">");
		int find = kb.nextInt();
		//find the requested value within ArrayList
		if (myList.contains(find) )
			System.out.println(find + " is in the ArrayList.");
		else
			System.out.println(find + " is NOT in the ArrayList.");
	}

}
