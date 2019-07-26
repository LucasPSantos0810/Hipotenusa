package Triangulo;

import javax.swing.JOptionPane;

public class Triangulo {
	
	public static void main (String[]args) {
		
		double a = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor"));
		double b = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite outro valor"));
		System.out.println(Math.sqrt((a*a)+(b*b)));

	}
}
