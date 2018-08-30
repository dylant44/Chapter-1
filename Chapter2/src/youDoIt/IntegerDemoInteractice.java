package youDoIt;

import java.util.Scanner;

public class IntegerDemoInteractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int anInt = 1234;
		byte aByte = 12; 
		short aShort = 12;
		long aLong = 1234567890987654321L;
		String name;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter an integer >> ");
		anInt = input.nextInt();
		System.out.println("Please enter a byte >> ");
		aByte = input.nextByte();
		System.out.println("Please enter a short >> ");
		aShort = input.nextShort();
		System.out.println("Please enter a long >> ");
		aLong = input.nextLong();
		System.out.println("What is your name? >> ");
		name = input.next();
		
		
		System.out.println("Your name is " + name);
		System.out.println("The int is " + anInt);
		System.out.println("The byte is " + aByte);
		System.out.println("The short is " + aShort);
		System.out.println("The long is " + aLong);
		
	}

}
