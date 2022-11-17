package com.java.gridbaglayout;

import java.awt.Color;
import java.awt.Insets;
import java.awt.Container;
import java.awt.ComponentOrientation;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainFrame {
    final static boolean shouldFill = true;
    final static boolean shouldWeightX = true;
    final static boolean RIGHT_TO_LEFT = false;

    public static void addComponentsToPanel(Container panel) {
        if (RIGHT_TO_LEFT) {
            panel.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        }

        JLabel label;
        panel.setLayout(new GridBagLayout());
        panel.setBackground(Color.DARK_GRAY);
        GridBagConstraints c = new GridBagConstraints();
        if (shouldFill) {
        //natural height, maximum width
        c.fill = GridBagConstraints.HORIZONTAL;
        }
    
        /* 1st Button */
        label = new JLabel("Label One");
        label.setForeground(Color.WHITE);
        if (shouldWeightX) {
        c.weightx = 0.5;
        }
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        panel.add(label, c);
    
        /* 2nd Button */
        label = new JLabel("Label Two");
        label.setForeground(Color.WHITE);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 0;
        panel.add(label, c);
    
        /* 3th Button */
        label = new JLabel("Label Three");
        label.setForeground(Color.WHITE);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 2;
        c.gridy = 0;
        panel.add(label, c);
    
        /* 4th Button */
        label = new JLabel("Long-Named Label Four");
        label.setForeground(Color.WHITE);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 40;      //make this component tall
        c.weightx = 0.0;
        c.gridwidth = 3;
        c.gridx = 0;
        c.gridy = 1;
        panel.add(label, c);
    
        /* 5th Button */
        label = new JLabel("Label Five");
        label.setForeground(Color.WHITE);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 0;       //reset to default
        c.weighty = 1.0;   //request any extra vertical space
        c.anchor = GridBagConstraints.PAGE_END; //bottom of space
        c.insets = new Insets(10,0,0,0);  //top padding
        c.gridx = 1;       //aligned with button 2
        c.gridwidth = 2;   //2 columns wide
        c.gridy = 2;       //third row
        panel.add(label, c);
    }

    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("GridBagLayout Demo");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
 
        //Set up the content pane.
        addComponentsToPanel(frame.getContentPane());
 
        //Display the window.
        // frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
    
}
