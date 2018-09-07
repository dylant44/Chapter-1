package youDoIt;

import javax.swing.JOptionPane;

public class Eggs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numDozen;
		int numSingleEggs;
		int numEggsNeeded;
		double dozenPrice = 3.25;
		double singleEggPrice = .45;
		double totalPrice;
		String eggsNeeded;
		
		
		eggsNeeded = JOptionPane.showInputDialog("How many eggs do you need?");
		numEggsNeeded = Integer.parseInt(eggsNeeded);
		
		numDozen = (numEggsNeeded / 12);
		numSingleEggs = (numEggsNeeded % 12);
		totalPrice = ((numDozen * dozenPrice) + (numSingleEggs * singleEggPrice));
		
		
		
		
		System.out.print("You ordered " + numEggsNeeded + " eggs. That's " + numDozen + " dozen at $3.25 per dozen and " + numSingleEggs + " loose eggs at $0.45 each for a total of " + totalPrice);
	
		
		
		
		
		
		
		
		
		
		
		
	}

}
