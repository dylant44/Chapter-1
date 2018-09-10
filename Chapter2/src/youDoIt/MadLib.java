package youDoIt;

import javax.swing.JOptionPane;

public class MadLib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String noun1;
		String noun2;
		String adjective;
		String verb;
		String noun3;
		
		noun1 = JOptionPane.showInputDialog("Enter an noun");
		adjective = JOptionPane.showInputDialog("Enter an adjective");
		verb = JOptionPane.showInputDialog("Enter a past tense verb");
		noun2 = JOptionPane.showInputDialog("Enter another noun");
		noun3 = JOptionPane.showInputDialog("Enter one more noun");
		
		
		System.out.print("Mary had a little " + noun1);
		System.out.print(" Its " + noun2 + " was " + adjective + " as snow ");
		System.out.print("And everwhere that Mary " + verb );
		System.out.print("The " + noun3 + " was sure to go");
		
		
		
		
		
		
		
		
	}

}
