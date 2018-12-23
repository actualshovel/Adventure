import java.util.ArrayList;
import java.util.Random;

public class BasicArrayList2 {

	public static void main(String[] args) {
		Random r = new Random();
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i=0; i<10; i++)
			list.add(1+ r.nextInt(100));
		
		System.out.println("Random List: " + list);
		System.out.println("ArrayList size: " + list.size());
	}
}