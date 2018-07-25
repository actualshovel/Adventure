public class FizzBuzz
{
	public static void main(String[] args)
	{
		for (int i = 1; i <= 100; i++) {
			if ( i%3==0 && i%5==0) //check number is a multiple of 3 & 5 first
				System.out.println("FizzBuzz");
			else if (i % 3 == 0) //number is a multiple of 3
				System.out.println("Fizz");
			else if ( i % 5 == 0) //number is a multiple of 5
				System.out.println("Buzz");
			else //print number if none of the above
			System.out.println(i); }
	}
}