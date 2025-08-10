package project;

import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

public class WebDevCourseRegistration_Part1 {
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
       
        frame.setVisible(true);
    }
}