package com.java.jpassword;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

public class MainFrame {
    private JFrame frame;
    private JLabel label;
    private JPasswordField passwordField;
    private JButton button;

    public MainFrame() {
        initialize();
    }

    private void initialize() {


        frame = new JFrame();
        frame.setTitle("JPasswordField Demo");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(800, 500);
        frame.setLayout(new BorderLayout(10, 10));
        frame.setLocationRelativeTo(null);

        FlowLayout layout = new FlowLayout();
        layout.setAlignment(FlowLayout.LEFT);
        layout.setHgap(10);
        layout.setVgap(10);

        frame.setLayout(layout);

        label = new JLabel("Enter Password");
        passwordField = new JPasswordField(10);
        button = new JButton("Check");

        frame.add(label);
        frame.add(passwordField);
        frame.add(button);

    }

    public void show() {
        this.frame.setVisible(true);
    }
}
