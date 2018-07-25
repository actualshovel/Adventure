/*
*This is a simple problem, to take a number to count from
*and a number to count TO, and go up to that number
*by what ever increment the user chooses.
*I am experimenting here with using a method for input, calling that method
*multiple times, and storing input in separate variables from a single
*method. My other practice point here is keeping each input
*in an array.
*/

import java.util.Scanner;
public class CountingRevisited
{
	public static void main(String[] args)
	{
		int[] numInput = new int[3]; //array with a size of 3
		
		//call input method, store in array of ints
		System.out.print("Count from: ");
		numInput[0] = getInput();
		System.out.print("Count to: ");
		numInput[1] = getInput();
		System.out.print("Count by: ");
		numInput[2] = getInput();
		
		for (int i=numInput[0]; i<=numInput[1]; i+=numInput[2]) {
		System.out.println(i);
		}
		
	}
		
	public static int getInput()
	{
		Scanner kb = new Scanner(System.in);
		int num = kb.nextInt();
		return num;
	}
}