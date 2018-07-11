package elseif;

import javax.swing.JOptionPane;

public class Horoscope {
	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog("What is your horoscope?");
		if(answer.equals("Aries")) {
			JOptionPane.showMessageDialog(null, "Nice");
		}
		else if(answer.equals("Taurus")) {
			JOptionPane.showMessageDialog(null, "Nice");
		}
		else if(answer.equals("Gemini")) {
			JOptionPane.showMessageDialog(null, "Nice");
		}
		else if(answer.equals("Cancer")) {
			JOptionPane.showMessageDialog(null, "Nice");
		}
		else if(answer.equals("Leo")) {
			JOptionPane.showMessageDialog(null, "Nice");
		}
		
	}

}
