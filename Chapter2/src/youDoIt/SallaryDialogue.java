package youDoIt;

import javax.swing.JOptionPane;

public class SallaryDialogue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String wageString;
		String dependantString;
		
		double wage;
		double weeklyPay;
		int dependant;
		final double HOURS_IN_WEEK = 37.5;
		
		wageString = JOptionPane.showInputDialog(null,
				"Enter employee's hourly wage", "Salary Dialog 1", 
				JOptionPane.INFORMATION_MESSAGE);
		weeklyPay = Double.parseDouble(wageString) * HOURS_IN_WEEK;
		
		dependantString = JOptionPane.showInputDialog(null,
				"How many dependants?", "Salary Dialog2",
				JOptionPane.QUESTION_MESSAGE);
		dependant = Integer.parseInt(dependantString);
		JOptionPane.showMessageDialog(null,
				"Weekly Salary is $" + weeklyPay + 
				"\nDeductions will be made for " +
						dependant + "dependants.");
				
		
		
		
		
	}

}
