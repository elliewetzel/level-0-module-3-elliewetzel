package elseif;

import javax.print.attribute.standard.JobImpressions;
import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {
		String happy = JOptionPane.showInputDialog("Are you happy?");
		if(happy.equals("yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
		}
		else {
			String no = JOptionPane.showInputDialog("Do you want to be happy?");
				if(no.equals("yes")) {
					JOptionPane.showMessageDialog(null, "Change Something");
				}
				else {
					JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
				}
		}
		}

}
