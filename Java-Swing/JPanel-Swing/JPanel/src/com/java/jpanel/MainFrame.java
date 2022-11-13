package com.java.jpanel;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame {

    // Create a new private type JFrame
    private JFrame frame;
    
    // Constructor to call frame initialization methode
    public MainFrame() {
        initialize();
    }
    // Frame atributes
    private void initialize() {
        frame = new JFrame();
        frame.setLayout(new BorderLayout(10, 5));
        frame.setTitle("Swing JPanel");
        frame.setSize(800, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Create a new JPanel
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));

        // Background color of the panel
        panel.setBackground(Color.RED);

        // Creating button component and adding to the panel
        Button btn = new Button("Click me!");
        panel.add(btn);
        
        // Add JPanel to JFrame
        frame.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    }
    
}
