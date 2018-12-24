import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
public class SortingArrayList {

	public static void main(String[] args) {
		Random r = new Random();
		ArrayList<Integer> myList = new ArrayList<Integer>(10);
		
		for (int i=0; i<10;i++)
			myList.add(10 + r.nextInt(99) );
		System.out.println("ArrayList before: " + myList);
		
		selectionSort(myList);
		System.out.println("ArrayList after: " + myList);
	}
	
	//sort in descending order
	static void selectionSort(ArrayList<Integer> myList )
	{
		Collections.sort(myList, Collections.reverseOrder() );
	}
}
