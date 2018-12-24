import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class CopyingArrayLists {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		Random r = new Random();
		
		//fill list1 with 10 random numbers
		for (int i=0; i<10; i++)
			list1.add(1+r.nextInt(100));
		
		//create list2, copy all values from list1
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.addAll(list1);
		
		//replace last value of list1 with -7
		list1.set(9, -7);
		
		//display both ArrayLists
		System.out.println("first list: " + list1);
		System.out.println("second list: " + list2);
	}

}
