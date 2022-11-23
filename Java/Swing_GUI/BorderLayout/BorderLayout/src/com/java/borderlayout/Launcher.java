package com.java.borderlayout;

/* Standard layout of border layout is the 5 layouts,
    North, East, South, West (clock wise)
 */

import javax.swing.SwingUtilities;

public class Launcher {
    
    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                
                MainFrame frame = new MainFrame();
                frame.show();
            }
        });
    }
}
