import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        JLabel label1 = new JLabel("Number 1:");
        JTextField textField1 = new JTextField();
        JLabel label2 = new JLabel("Number 2:");
        JTextField textField2 = new JTextField();
        JButton addButton = new JButton("Add");
        JButton subtractButton = new JButton("Subtract");

        panel.add(label1);
        panel.add(textField1);
        panel.add(label2);
        panel.add(textField2);
        panel.add(addButton);
        panel.add(subtractButton);
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(textField1.getText());
                    double num2 = Double.parseDouble(textField2.getText());
                    double sum = num1 + num2;
                    JOptionPane.showMessageDialog(frame, "Sum: " + sum);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Invalid input. Please enter valid numbers.");
                }
            }
        });
        subtractButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(textField1.getText());
                    double num2 = Double.parseDouble(textField2.getText());
                    double difference = num1 - num2;
                    JOptionPane.showMessageDialog(frame, "Difference: " + difference);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Invalid input. Please enter valid     numbers.");
                }
            }
        });
        frame.add(panel);
        frame.setVisible(true);
    }
}