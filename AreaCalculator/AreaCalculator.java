/*Have the user select a shape and enter it's dimensions.
*You are then given the area for that shape.
*Program will loop until you quit.
*/

import java.util.Scanner;
public class AreaCalculator
{
	public static void main(String[] args)
	{
		System.out.println("Shape Area Calculator\n\n");
		int choice = 0;
		double result = 0;
		
		while ( choice < 5 )
		{
			//present user with options
			System.out.println("1) Triangle");
			System.out.println("2) Rectangle");
			System.out.println("3) Square");
			System.out.println("4) Circle");
			System.out.println("5) Quit");
			System.out.print("Which shape: ");
			choice = getInput();
			
			switch (choice) {
				case 1: result = triangleArea();
				break;
				case 2: result = rectangleArea();
				break;
				case 3: result = squareArea();
				break;
				case 4: result = circleArea();
				break;
				case 5: System.out.println("Goodbye!");
				break; 
				default: System.out.println("Not an option.");
				break; }
			
			//only display area if user has not quit
			if (choice < 5)
				System.out.println("The area is " + result);
				System.out.println("**************************\n");
		}//end while loop
		
	}//end main
	
	//method for input
	public static int getInput()
	{
		Scanner kb = new Scanner(System.in);
		int choose = kb.nextInt();
		return choose;
	}
	
	//area formulas
	public static int triangleArea()
	{
		System.out.print("Base: ");
		int b = getInput();
		System.out.print("Height: ");
		int h = getInput();
		int area = ( (b*h)/2 );
		return area;
	}

	public static int rectangleArea()
	{
		System.out.print("Length: ");
		int l = getInput();
		System.out.print("Width: ");
		int w = getInput();
		int area = (l * w);
		return area;
	}
	
	public static int squareArea()
	{
		System.out.print("Side Length: ");
		int s = getInput();
		int area = (s*s);
		return area;
	}
	
	public static double circleArea()
	{
		System.out.print("Radius: ");
		double r = getInput();
		double area = Math.PI * ( r*r );
		return area;
	}
}