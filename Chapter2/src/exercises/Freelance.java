package exercises;

import java.util.Scanner;

public class Freelance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int int1;
		int int2;
		int intTotal;
		String name;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter an integer >> ");
		int1 = input.nextInt();
		System.out.println("Please enter another integer >> ");
		int2 = input.nextInt();
		System.out.println("Please enter your name >> ");
		name = input.next();
		
		intTotal = int1 + int2;
		
		
		System.out.println("The total is " + intTotal);
		System.out.println("Your name is " + name );
		
		
		
		
		
		
		
	}

}
