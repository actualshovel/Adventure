package programByDoing;
import java.util.Scanner;

public class ParallelArrays {

	public static void main(String[] args) {
		String[] lastName = { "alpha", "bravo", "charlie", "delta", "echo" };
		double[] grade = {79.5, 99, 68, 81, 70.9 };
		int[] id = {123456, 789123, 789456, 561237, 547852 };
		
		for (int i=0; i < lastName.length; i++ )
		{
			System.out.println(lastName[i] + " " + grade[i] + " " + id[i]);
		}
		
		Scanner kb = new Scanner(System.in);
		
		//find just one student
		System.out.print("\nID to find: ");
		int find = kb.nextInt();
		
		for (int i=0; i<id.length; i++ )
		{
			if (find == id[i])
			{
				System.out.print("Found in slot " + i);
				System.out.println("\nName: " + lastName[i]);
				System.out.println("Average: " + grade[i]);
				System.out.println("ID: " + id[i]);
			}
		}
	}
}
