
package project;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

public class WebDevCourseRegistration {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Web Development Course Registration");
        frame.setSize(600, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        
        JLabel titleLabel = new JLabel("Register for Our Web Development Course");
        titleLabel.setBounds(130, 30, 400, 30);
        titleLabel.setForeground(Color.BLUE);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 17));
        frame.getContentPane().setBackground(new Color(230, 240, 255));
        frame.add(titleLabel);
       
        JLabel nameLabel = new JLabel("Full Name:");
        nameLabel.setBounds(50, 80, 110, 30);
        frame.add(nameLabel);
        
        JTextField nameField = new JTextField();
        nameField.setBounds(170, 80, 200, 30);
        frame.add(nameField);
       
        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(50, 120, 130, 30);
        frame.add(emailLabel);
        
        JTextField emailField = new JTextField();
        emailField.setBounds(170, 120, 200, 30);
        frame.add(emailField);
        
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(50, 160, 120, 30);
        frame.add(passwordLabel);
     
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(170, 160, 200, 30);
        frame.add(passwordField);
        
        JLabel confirmPasswordLabel = new JLabel("Confirm Password:");
        confirmPasswordLabel.setBounds(50, 200, 150, 30);
        frame.add(confirmPasswordLabel);

        JPasswordField confirmPasswordField = new JPasswordField();
        confirmPasswordField.setBounds(170, 200, 200, 30);
        frame.add(confirmPasswordField);

        JLabel warningLabel = new JLabel("Passwords do not match!");
        warningLabel.setBounds(200, 230, 200, 20);
        warningLabel.setForeground(Color.RED);
        warningLabel.setVisible(false);
        frame.add(warningLabel);

        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(50, 250, 100, 30);
        frame.add(genderLabel);

        JRadioButton maleButton = new JRadioButton("Male");
        maleButton.setBounds(150, 250, 70, 30);
        frame.add(maleButton);
        
        JRadioButton femaleButton = new JRadioButton("Female");
        femaleButton.setBounds(230, 250, 90, 30);
        frame.add(femaleButton);
        
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);
                
        JCheckBox agreeBox = new JCheckBox("I agree to the terms and conditions");
        agreeBox.setBounds(50, 280, 300, 30);
        frame.add(agreeBox);
        
        JLabel trackLabel = new JLabel("Preferred Track:");
        trackLabel.setBounds(50, 320, 120, 30);
        frame.add(trackLabel);

        String[] tracks = {"Frontend Development", "Backend Development", "Full Stack Development"};
        JComboBox<String> trackBox = new JComboBox<>(tracks);
        trackBox.setBounds(200, 320, 200, 30);
        frame.add(trackBox); 
        
        JLabel expLabel = new JLabel("Experience Level:");
        expLabel.setBounds(50, 360, 120, 30);
        frame.add(expLabel);

        String[] levels = {"Beginner", "Intermediate", "Advanced"};
        JComboBox<String> experienceBox = new JComboBox<>(levels);
        experienceBox.setBounds(200, 360, 200, 30);
        frame.add(experienceBox);
        
        JButton submitBtn = new JButton("Submit");
        submitBtn.setBounds(400, 410, 100, 30);
        submitBtn.setBackground(new Color(66, 133, 244)); 
        submitBtn.setForeground(Color.WHITE);
        submitBtn.setFocusPainted(false);
        submitBtn.setFont(new Font("Arial", Font.BOLD, 14));
        frame.add(submitBtn);
        
        submitBtn.addActionListener(e -> {
            String name = nameField.getText().trim();
            String email = emailField.getText().trim();
            String password = new String(passwordField.getPassword());
            String confirmPassword = new String(confirmPasswordField.getPassword());

            String gender = "";
            if (maleButton.isSelected()) {
                gender = "Male";
            } else if (femaleButton.isSelected()) {
                gender = "Female";
            } else {
                gender = "Not Selected";
            }

            if (name.isEmpty() || email.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
                JOptionPane.showMessageDialog(frame,
                        "Please fill all the required fields!",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            if (!password.equals(confirmPassword)) {
                warningLabel.setVisible(true);
                JOptionPane.showMessageDialog(frame,
                        "Passwords do not match!",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                return;
            } else {
                warningLabel.setVisible(false);
            }

            if (!agreeBox.isSelected()) {
                JOptionPane.showMessageDialog(frame,
                        "Please agree to the terms and conditions.",
                        "Warning",
                        JOptionPane.WARNING_MESSAGE);
                return;
            }

            String selectedTrack = (String) trackBox.getSelectedItem();
            String selectedLevel = (String) experienceBox.getSelectedItem();

            JPanel panel = new JPanel();
            panel.setBackground(new Color(230, 240, 255)); 
            panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
            
            JLabel info = new JLabel("<html>"
                    + "<b><font color='green' size='+1'>Registration Successful!</font></b><br><br>"
                    + "<font color='blue'>Full Name:</font> " + name + "<br>"
                    + "<font color='blue'>Email:</font> " + email + "<br>"
                    + "<font color='blue'>Gender:</font> " + gender + "<br>"
                    + "<font color='blue'>Preferred Track:</font> " + selectedTrack + "<br>"
                    + "<font color='blue'>Experience Level:</font> " + selectedLevel
                    + "</html>");
            panel.add(info);
            JOptionPane.showMessageDialog(frame, panel, "Success", JOptionPane.PLAIN_MESSAGE);
        });

        frame.setVisible(true);
    }
}
