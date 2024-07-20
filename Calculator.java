import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {
    private JTextField display;
    private String operator;
    private double operand1;
    private double operand2;
    private boolean startNewNumber;

    public Calculator() {
        operator = "";
        operand1 = 0;
        operand2 = 0;
        startNewNumber = true;

        setTitle("Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        display = new JTextField();
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setFont(new Font("Arial", Font.PLAIN, 24));

        String[] buttonLabels = {
                "7", "8", "9", "/", 
                "4", "5", "6", "*", 
                "1", "2", "3", "-", 
                "0", ".", "=", "+"
        };
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4));

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.setFont(new Font("Arial", Font.PLAIN, 24));
            button.addActionListener(this);
            buttonPanel.add(button);
        }
        setLayout(new BorderLayout());
        add(display, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if ("0123456789.".contains(command)) {
            if (startNewNumber) {
                display.setText(command);
                startNewNumber = false;
            } else {
                display.setText(display.getText() + command);
            }
        } else if ("+-*/".contains(command)) {
            operator = command;
            operand1 = Double.parseDouble(display.getText());
            startNewNumber = true;
        } else if ("=".equals(command)) {
            operand2 = Double.parseDouble(display.getText());
            double result = 0;
            switch (operator) {
                case "+": result = operand1 + operand2; break;
                case "-": result = operand1 - operand2; break;
                case "*": result = operand1 * operand2; break;
                case "/": 
                    if (operand2 != 0) {
                        result = operand1 / operand2; 
                    } else {
                        JOptionPane.showMessageDialog(this, "Cannot divide by zero", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    break;
            }
            display.setText(String.valueOf(result));
            startNewNumber = true;
        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Calculator calculator = new Calculator();
            calculator.setVisible(true);
        });
    }
}