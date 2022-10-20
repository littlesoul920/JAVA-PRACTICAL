/*Q3.program to find (a) SQUARE (b) CUBE (C) CHECK USING SWITCH CASE EVEN OR ODD
@Author: SUMAN KUMAR
@Date: 20.10.22*/

//importing packages
import java.util.Scanner;
//Creating class
class Squarecube
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");// taking input form the user
		int num = sc.nextInt();
		
		//menu
		System.out.println("1. Square");
		System.out.println("2. Cube");
		System.out.println("3. Even/Odd");
		
		int choice= sc.nextInt();
		
		//Switch case to choose what you want to do
		switch(choice)
		{
			case '1': square(int a1);
			break;
			case '2': cube(int a1);
			break;
			case '3': EvenOdd(int a1);
			break;
		}
		
	}
	// logic for find the square
	static void square(int a1)
	{
		int sq = num*num;
		System.out.println("Square of number is : "+sq);
	}
	
	//calculating using arithmathic expression for Cube
	static void cube(int a1)
	{
		int cub = num*num*num;
		System.out.println("Square of number is : "+cub);
	}
	
	//Method for Even/Odd
	static void EvenOdd(int a1)
	{
		if(a1%2==0)
			System.out.println("Number is Even");
		else
			System.out.println("Number is Odd");
	}
	
	
}