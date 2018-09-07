package youDoIt;

import javax.swing.JOptionPane;

public class InchesToFeetInteractive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int inches;
		int inchesInFeet = 12;
		int inchesResult;
		int feetResult;
		String inchesString;
		
		inchesString = JOptionPane.showInputDialog(null, "How many inches?");
		inches = Integer.parseInt(inchesString);
		
		feetResult = (inches / inchesInFeet);
		inchesResult = (inches % inchesInFeet);
		
		
		System.out.print("The result is " + feetResult + " feet and " + inchesResult + " inches");
		
		
		
		
		
		
		
	}

}
