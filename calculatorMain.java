import javax.swing.*;

/**
 * Testing calculator
 * 
 * @author Ravneet Kaur
 * @version 1.0
 * @since 2018-11-04
 */
public class calculatorMain {
	public static void main(String[] args) {
        // TODO Auto-generated method stub
        Calculator calc = new Calculator();
        calc.setSize(300, 440);
        calc.setTitle(" Calculator ");
        calc.setResizable(false);
        calc.setVisible(true);
        calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
