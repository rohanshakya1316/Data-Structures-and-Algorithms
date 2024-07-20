import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AuthenticatePage extends JFrame {
    private final JTextField usernameField;
    private final JPasswordField passwordField;
    private final JButton loginButton;

    public AuthenticatePage() {
        setTitle("User Authentication");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350, 250);

        // Create panel and set layout
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 3, 2, 2));

        // Username label and field
        JLabel usernameLabel = new JLabel("Username:");
        usernameField = new JTextField();
        panel.add(usernameLabel);
        panel.add(usernameField);

        // Password label and field
        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField();
        panel.add(passwordLabel);
        panel.add(passwordField);

        // Login button
        loginButton = new JButton("Login");
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                char[] passwordChars = passwordField.getPassword();
                String password = new String(passwordChars);

                // Example validation (replace with your authentication logic)
                if (username.equals("admin") && password.equals("password")) {
                    JOptionPane.showMessageDialog(AuthenticatePage.this,
                            "Login successful!");
                } else {
                    JOptionPane.showMessageDialog(AuthenticatePage.this,
                            "Login failed. Invalid username or password.",
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        panel.add(loginButton);

        // Add panel to frame
        add(panel);

        // Center frame on screen
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        // Run the Swing application on the Event Dispatch Thread (EDT)
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                AuthenticatePage pageAuth = new AuthenticatePage();
                pageAuth.setVisible(true);
            }
        });
    }
}

