package com.java.flowlayout;

/* FlawLayout manager manages the allignment of the components of a JPanel.
If components of a JPanel runs out of space FlawLayout manager wraps the components into the next line */

import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame {
    
    private JFrame frame;
    private JPanel panel;

    public MainFrame(){
        intialize();
    }

    private void intialize() {
        frame = new JFrame();
        frame.setTitle("FlawLayout Demo");

        /*Initializing FlawLayout manager to JPanel explicitly*/
        panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 5));
        panel.setBackground(Color.PINK);

        for (int i = 0; i <= 5; i++) {
            /* Crating button component */
            JButton button = new JButton("Button" + Integer.toString(i));
            /* Adding component to the JPanel */
            panel.add(button);
            
        }

        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(800, 500);
        frame.setLocationRelativeTo(null);

        frame.add(panel, BorderLayout.NORTH);

        frame.setVisible(true);

    }

}
