package com.java.jpanel;

import javax.swing.SwingUtilities;

public class Launcher {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            // Override mainframe to run the program
            @Override
            public void run() {
                // Create a new frame to run mainframe
                MainFrame frame = new MainFrame();
                
            }
        });
    }
}
