import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorGUI extends JFrame implements ActionListener {

    private JTextField displayField;
    private JButton[] numberButtons;
    private JButton[] operatorButtons;
    private JButton addButton, subtractButton, multiplyButton, divideButton, equalButton, clearButton;
    private double num1, num2, result;
    private char operator;

    public CalculatorGUI() {
        setTitle("Simple Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 4, 10, 10));

        displayField = new JTextField();
        displayField.setEditable(false);
        add(displayField);

        numberButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
        }

        operatorButtons = new JButton[4];
        addButton = new JButton("+");
        subtractButton = new JButton("-");
        multiplyButton = new JButton("*");
        divideButton = new JButton("/");

        operatorButtons[0] = addButton;
        operatorButtons[1] = subtractButton;
        operatorButtons[2] = multiplyButton;
        operatorButtons[3] = divideButton;

        for (JButton operatorButton : operatorButtons) {
            operatorButton.addActionListener(this);
        }

        equalButton = new JButton("=");
        equalButton.addActionListener(this);

        clearButton = new JButton("C");
        clearButton.addActionListener(this);

        add(clearButton);
        add(operatorButtons[3]);
        add(operatorButtons[2]);
        add(divideButton);
        add(numberButtons[7]);
        add(numberButtons[8]);
        add(numberButtons[9]);
        add(operatorButtons[1]);
        add(numberButtons[4]);
        add(numberButtons[5]);
        add(numberButtons[6]);
        add(operatorButtons[0]);
        add(numberButtons[1]);
        add(numberButtons[2]);
        add(numberButtons[3]);
        add(equalButton);
        add(numberButtons[0]);
        add(new JLabel());
        add(new JLabel());
        add(new JLabel());

        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if ((command.charAt(0) >= '0' && command.charAt(0) <= '9') || command.charAt(0) == '.') {
            displayField.setText(displayField.getText() + command);
        } else if (command.charAt(0) == 'C') {
            displayField.setText("");
            num1 = num2 = result = 0;
        } else if (command.charAt(0) == '=') {
            num2 = Double.parseDouble(displayField.getText());
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
            }
            displayField.setText(String.valueOf(result));
            num1 = result;
        } else {
            num1 = Double.parseDouble(displayField.getText());
            operator = command.charAt(0);
            displayField.setText("");
        }
    }

    public static void main(String[] args) {
        new CalculatorGUI();
    }
}