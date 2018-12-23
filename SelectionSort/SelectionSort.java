import java.util.Random;

public class SelectionSort
{
	public static void selection_sort( int[] a )
	{
		int minIndex, temp;
		//outer loop begin
		for (int i = 0; i<a.length; i++) {
			minIndex = i;
			//find the smallest number in array after starting point
			for (int j = i+1; j < a.length; j++) {
				if (a[j] < a[minIndex])
					minIndex = j; }
			//bring smallest number to current starting point
			if (minIndex != i) {
				temp = a[i];
				a[i] = a[minIndex];
				a[minIndex] = temp;
			}
		}//end outer loop
	}


	public static void main( String[] args )
	{
		Random r = new Random();
		int[] arr = new int[10];
		int i;

		// Fill up the array with random numbers
		for ( i=0; i<arr.length; i++ )
			arr[i] = 1 + r.nextInt(100);

		// Display it
		System.out.print("before: ");
		for ( i=0; i<arr.length; i++ )
			System.out.print( arr[i] + " " );
		System.out.println();

		// Sort it
		selection_sort( arr );

		// Display it again to confirm that it's sorted
		System.out.print("after : ");
		for ( i=0; i<arr.length; i++ )
			System.out.print( arr[i] + " " );
		System.out.println();
	}
}