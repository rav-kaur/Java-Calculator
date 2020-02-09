import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

/**
 * Base class for calculator
 * 
 * @author Ravneet Kaur
 * @version 1.0
 * @since 2018-11-04
 */
public class Calculator extends JFrame{


	private static final long serialVersionUID = 1L;

	private final JButton num0, num1, num2, num3, num4, num5, num6, num7, num8, num9;
	private final JButton add, subtract, multiply, divide, equal, clear, space1, space2, space3, space4;

	private JTextField result;
	private JTextField equation;
	String output = "";
	private Double temp;
	private char operator;


	//constructor for calculator class
	public Calculator () {
		JPanel numbers = new JPanel();


		numbers.setLayout(new GridLayout(4,5));
		numbers.add(num7 = new JButton("7"));
		numbers.add(num8 = new JButton("8"));
		numbers.add(num9 = new JButton("9"));
		numbers.add(divide = new JButton("/"));
		numbers.add(clear = new JButton("C"));

		numbers.add(num4 = new JButton("4"));
		numbers.add(num5 = new JButton("5"));
		numbers.add(num6 = new JButton("6"));
		numbers.add(multiply = new JButton("*"));
		numbers.add(space1 = new JButton(""));

		numbers.add(num1 = new JButton("1"));
		numbers.add(num2 = new JButton("2"));
		numbers.add(num3 = new JButton("3"));
		numbers.add(subtract = new JButton("-"));
		numbers.add(space2 = new JButton(""));

		numbers.add(space3 = new JButton(""));
		numbers.add(num0 = new JButton("0"));
		numbers.add(space4 = new JButton(""));
		numbers.add(add = new JButton("+"));
		numbers.add(equal = new JButton("="));




		JPanel display1 = new JPanel();
		display1.setLayout(new FlowLayout());
		display1.add(equation = new JTextField(20));
		equation.setHorizontalAlignment(JTextField.CENTER);
		equation.setSize(300,100);
		equation.setEditable(false);

		JPanel display2 = new JPanel();
		display2.setLayout(new FlowLayout());
		display2.add(result = new JTextField(20));
		result.setSize(300,300);
		result.setHorizontalAlignment(JTextField.CENTER);
		result.setEditable(false);

		JPanel p = new JPanel();
		p.setLayout(new GridLayout(3,1));
		p.add(display1);
		p.add(display2);
		p.add(numbers);



		add(p);

		num0.addActionListener(new ZeroListener());
		num1.addActionListener(new OneListener());
		num2.addActionListener(new TwoListener());
		num3.addActionListener(new ThreeListener());
		num4.addActionListener(new FourListener());
		num5.addActionListener(new FiveListener());
		num6.addActionListener(new SixListener());
		num7.addActionListener(new SevenListener());
		num8.addActionListener(new EightListener());
		num9.addActionListener(new NineListener());

		add.addActionListener(new AdditionListener());
		subtract.addActionListener(new SubtractionListener());
		multiply.addActionListener(new MultiplicationListener());
		divide.addActionListener(new DivisionListener());
		equal.addActionListener(new EqualListener());
		clear.addActionListener(new ClearListener());


	}

	// -------------------------------------------------------------------------------
	/**
	 * An inner class that uses an ActionListener to access the buttons. It sets
	 * the model values when the button is pressed.
	 */
	private class ZeroListener implements ActionListener {
		public void actionPerformed (ActionEvent e) {
			output += "0";
			equation.setText(output);
		}
	}

	// -------------------------------------------------------------------------------
	/**
	 * An inner class that uses an ActionListener to access the buttons. It sets
	 * the model values when the button is pressed.
	 */
	private class OneListener implements ActionListener {
		public void actionPerformed (ActionEvent e) {
			output += "1";
			equation.setText(output);
		}
	}

	// -------------------------------------------------------------------------------
	/**
	 * An inner class that uses an ActionListener to access the buttons. It sets
	 * the model values when the button is pressed.
	 */
	private class TwoListener implements ActionListener {
		public void actionPerformed (ActionEvent e) {
			output += "2";
			equation.setText(output);
		}
	}

	// -------------------------------------------------------------------------------
	/**
	 * An inner class that uses an ActionListener to access the buttons. It sets
	 * the model values when the button is pressed.
	 */
	private class ThreeListener implements ActionListener {
		public void actionPerformed (ActionEvent e) {
			output += "3";
			equation.setText(output);
		}
	}

	// -------------------------------------------------------------------------------
	/**
	 * An inner class that uses an ActionListener to access the buttons. It sets
	 * the model values when the button is pressed.
	 */
	private class FourListener implements ActionListener {
		public void actionPerformed (ActionEvent e) {
			output += "4";
			equation.setText(output);
		}
	}

	private class FiveListener implements ActionListener {
		public void actionPerformed (ActionEvent e) {
			output += "5";
			equation.setText(output);
		}
	}

	// -------------------------------------------------------------------------------
	/**
	 * An inner class that uses an ActionListener to access the buttons. It sets
	 * the model values when the button is pressed.
	 */
	private class SixListener implements ActionListener {
		public void actionPerformed (ActionEvent e) {
			output += "6";
			equation.setText(output);
		}
	}

	// -------------------------------------------------------------------------------
	/**
	 * An inner class that uses an ActionListener to access the buttons. It sets
	 * the model values when the button is pressed.
	 */
	private class SevenListener implements ActionListener {
		public void actionPerformed (ActionEvent e) {
			output += "7";
			equation.setText(output);
		}
	}

	// -------------------------------------------------------------------------------
	/**
	 * An inner class that uses an ActionListener to access the buttons. It sets
	 * the model values when the button is pressed.
	 */
	private class EightListener implements ActionListener {
		public void actionPerformed (ActionEvent e) {
			output += "8";
			equation.setText(output);
		}
	}

	// -------------------------------------------------------------------------------
	/**
	 * An inner class that uses an ActionListener to access the buttons. It sets
	 * the model values when the button is pressed.
	 */
	private class NineListener implements ActionListener {
		public void actionPerformed (ActionEvent e) {
			output += "9";
			equation.setText(output);
		}
	}

	// -------------------------------------------------------------------------------
	/**
	 * An inner class that uses an ActionListener to access the buttons. It sets
	 * the model values when the button is pressed.
	 */
	private class AdditionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			equation.setText("");
			output += "+";
			equation.setText(output);

			operator = '+';
		}
	}

	// -------------------------------------------------------------------------------
	/**
	 * An inner class that uses an ActionListener to access the buttons. It sets
	 * the model values when the button is pressed.
	 */
	private class SubtractionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			equation.setText("");
			output += "-";
			equation.setText(output);

			operator = '-';
		}
	}

	// -------------------------------------------------------------------------------
	/**
	 * An inner class that uses an ActionListener to access the buttons. It sets
	 * the model values when the button is pressed.
	 */
	private class MultiplicationListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			equation.setText("");
			output += "*";
			equation.setText(output);

			operator = '*';
		}
	}

	// -------------------------------------------------------------------------------
	/**
	 * An inner class that uses an ActionListener to access the buttons. It sets
	 * the model values when the button is pressed.
	 */
	private class DivisionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			equation.setText("");
			output += "/";
			equation.setText(output);

			operator = '/';
		}
	}

	// -------------------------------------------------------------------------------
	/**
	 * An inner class that uses an ActionListener to access the buttons. It sets
	 * the model values when the button is pressed.
	 */
	private class EqualListener implements ActionListener {
		public void actionPerformed (ActionEvent e) {

			try {
				String leftSide = equation.getText().substring(0, equation.getText().indexOf(operator + ""));
				String rightSide = equation.getText().substring(equation.getText().indexOf(operator + "") + 1, equation.getText().length());

				switch (operator) {
				case '+' :
					temp = (Double.parseDouble(leftSide) + Double.parseDouble(rightSide));
					break;
				case '-':
					temp = (Double.parseDouble(leftSide) - Double.parseDouble(rightSide));
					break;
				case '*':
					temp = (Double.parseDouble(leftSide) * Double.parseDouble(rightSide));
					break;
				case '/':
					temp = (Double.parseDouble(leftSide) / Double.parseDouble(rightSide));
					break;	
				default:
					temp = 0.0;
				}
			} catch (Exception isError){
				temp = 0.0;
			}

			result.setText(Double.toString(temp));

		}
	}

	// -------------------------------------------------------------------------------
	/**
	 * An inner class that uses an ActionListener to access the buttons. It sets
	 * the model values when the button is pressed.
	 */
	private class ClearListener implements ActionListener {
		public void actionPerformed (ActionEvent e) {
			equation.setText("");
			result.setText("");

			temp = (double) 0;
			output = "";
		}
	}
}
