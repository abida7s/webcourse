
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
        titleLabel.setBounds(80, 30, 400, 30);
        frame.add(titleLabel);
        
        JLabel nameLabel = new JLabel("Full Name:");
        nameLabel.setBounds(50, 80, 110, 30);
        frame.add(nameLabel);
        
        JTextField nameField = new JTextField();
        nameField.setBounds(160, 80, 200, 30);
        frame.add(nameField);
       
        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(50, 120, 130, 30);
        frame.add(emailLabel);
        
        JTextField emailField = new JTextField();
        emailField.setBounds(160, 120, 200, 30);
        frame.add(emailField);
     
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(50, 160, 120, 30);
        frame.add(passwordLabel);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(160, 160, 200, 30);
        frame.add(passwordField);

        JLabel confirmPasswordLabel = new JLabel("Confirm Password:");
        confirmPasswordLabel.setBounds(50, 200, 150, 30);
        frame.add(confirmPasswordLabel);

        JPasswordField confirmPasswordField = new JPasswordField();
        confirmPasswordField.setBounds(200, 200, 200, 30);
        frame.add(confirmPasswordField);

     
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
        
        JButton submitBtn = new JButton("Submit");
        submitBtn.setBounds(400, 410, 100, 30);
        submitBtn.setBackground(new Color(66, 133, 244)); 
        submitBtn.setForeground(Color.WHITE);
        submitBtn.setFocusPainted(false);
        submitBtn.setFont(new Font("Arial", Font.BOLD, 14));
        frame.add(submitBtn);
        
        frame.setVisible(true);
    }
}
