package youDoIt;

import javax.swing.JOptionPane;

public class NauticalMilesInteractive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double KM_IN_NM = 1.852;
		double M_IN_NM = 1.150779;
		double NauticalMiles;
		String nautMilesString;
		
		nautMilesString = JOptionPane.showInputDialog(null, "How many Nautical miles?");
		NauticalMiles = Integer.parseInt(nautMilesString);
		
		
		System.out.print("The result in miles is " + (NauticalMiles * M_IN_NM));
		System.out.print(" and the result in kilometers is " + (NauticalMiles * KM_IN_NM));
		
		
		
		
	}

}
