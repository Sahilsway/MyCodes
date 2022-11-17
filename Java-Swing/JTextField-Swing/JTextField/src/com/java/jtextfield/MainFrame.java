package com.java.jtextfield;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainFrame {
    private JFrame frame;
    private JPanel panel;
    private JTextField textField;
    private JLabel label;

    public MainFrame() {
        initialize();
    }

    private void initialize() {

        /* JFrame */
        frame = new JFrame();
        frame.setTitle("JTextField Demo");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(800, 500);
        frame.setLayout(new BorderLayout(10, 10));
        frame.setLocationRelativeTo(null);
        ImageIcon icon = new ImageIcon("logo.png");
        frame.setIconImage(icon.getImage());

        /* JPanel */
        panel = new JPanel();
        panel.setBackground(Color.GRAY);
        panel.setLayout(new FlowLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        /* JTextField */
        textField = createJTextField();
        panel.add(textField);

        /* JLabel */
        label = new JLabel();
        label.setFont(new Font("Arial", Font.BOLD, 24));
        panel.add(label);

        frame.add(panel, BorderLayout.NORTH);
        
    }

    /* createJTextField methode */
    public JTextField createJTextField() {
        JTextField textField = new JTextField(10);

        /* Set font of textField */
        textField.setFont(new Font("Arial", Font.BOLD, 24));

        /* Set color of text */
        textField.setForeground(Color.BLUE);
        /* Set backgroud color */
        textField.setBackground(Color.YELLOW);
        /* Set toolTipText */
        textField.setToolTipText("Name");
        /* Margin of text in the textField */
        textField.setMargin(new Insets(3, 6, 3, 6));
        /* AtionListner to listen for Enter when user clicks enter after after data input */
        textField.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                /* getText from textField */
                label.setText(textField.getText());
                /* setText to the textField */
                textField.setText("Enter more");
            }

        });

        return textField;
    }

    public void show() {
        this.frame.setVisible(true);
    }
    
}
