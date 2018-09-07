package youDoIt;

import javax.swing.JOptionPane;

public class Dollars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int twentyNote = 20;
		int numOfTwenties;
		int tenNote = 10;
		int numOfTens;
		int fiveNote = 5;
		int numOfFives;
		int oneNote = 1;
		int numOfOnes;
		int totalDollars;
		String numOfDollars; 
		
		
		numOfDollars = JOptionPane.showInputDialog("Enter a number");
		totalDollars = Integer.parseInt(numOfDollars);
		
		numOfTwenties = (totalDollars / twentyNote);
		numOfTens = (totalDollars % tenNote);
		numOfFives = (totalDollars % fiveNote);
		numOfOnes = (totalDollars % oneNote);
		
		System.out.print(numOfTwenties + " Twenties, " + numOfTens + " Tens, " + numOfFives + " Fives, and " + numOfOnes + " Ones.");
		
	
		
		
		
		
		
		
		
		
	}

}
