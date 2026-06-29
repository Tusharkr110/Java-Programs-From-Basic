package Basics;
import javax.swing.JOptionPane;
public class guis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = JOptionPane.showInputDialog("Enter your Name");
		JOptionPane.showMessageDialog(null, "Hello "+ name);
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter Your Age"));
		JOptionPane.showMessageDialog(null, "You are "+ age + " years old");
		
		double number = Double.parseDouble(JOptionPane.showInputDialog("Enter Your Phone no. " ));
		JOptionPane.showMessageDialog(null, "Your Phone Number is " +number);
}
}