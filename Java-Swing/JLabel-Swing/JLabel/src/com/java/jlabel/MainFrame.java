package com.java.jlabel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class MainFrame {
    
    private JFrame frame;
    private JPanel panel;
    private JLabel label;
    private JButton button;

    public MainFrame() {
        initialize();
    }

    private void initialize() {

        frame = new JFrame();
        frame.setTitle("JLabel Demo");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(800, 500);
        frame.setLocationRelativeTo(null);

        /* Create a new panel,
            Set panel border
             Set color to the panel
              Add panel to frame
         */
        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10,10, 10));
        panel.setBackground(Color.GRAY);
        frame.add(panel, BorderLayout.NORTH);

        /* Create a new label,
            Color of label text
             Set font style
              Add label to the panel
        */
        label = new JLabel("My Cool App");
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Sans-serief", Font.BOLD, 30));
        panel.add(label);

        /* Save icon to a variable
            Converting icon to image
             Resizing image
              Assigning back to icon
               Adding icon to label
                Gap between Icon and Text
                 Defining text horizontal position
                  Defining text vertical position
        */
        ImageIcon labelIcon = new ImageIcon("logo.png");
        Image icon = labelIcon.getImage();
        Image newIcon = icon.getScaledInstance(80, 80, java.awt.Image.SCALE_SMOOTH);
        labelIcon = new ImageIcon(newIcon);
        label.setIcon(labelIcon);
        label.setIconTextGap(10);
        // label.setHorizontalTextPosition(SwingConstants.CENTER);
        // label.setVerticalTextPosition(SwingConstants.BOTTOM);

        /* Create button */
        button = new JButton("Update label text");
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("<html>My Cool App <br> Buy it now!</html>");
            }

        });

        frame.add(button, BorderLayout.SOUTH);

    }

    public void show() {
        this.frame.setVisible(true);

    }
}
