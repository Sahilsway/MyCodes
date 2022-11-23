package com.java.gridlayout;

/* GridLayout is a layout manager class,
   It lays out components in a rectangular grid 
   It devides JFrame or JPanel in equialy sized rectangles and one rectangle holds one component*/

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame {
    private JFrame frame;
    private JPanel panel;

    public MainFrame() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();

        frame.setTitle("GridLayout Demo");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(800, 500);
        frame.setLocationRelativeTo(null);

        /* Default gridlayout creates multiple rectangles in a single row as many as necessary to hold all components,
            Unless we specify as we did here 
         */
        panel = new JPanel(new GridLayout(4, 0, 10 ,10));
        
        for (int i = 1; i <= 20; i++) {
            JButton button = new JButton("Button" + Integer.toString(i));
            panel.add(button);
        }
        /* If we don't specify which area of JFrame we want to add components,
           BorderLayout manager will add it to the CENTER by default */
        frame.add(panel);

        frame.pack();
        frame.setVisible(true);
        
    }
}
