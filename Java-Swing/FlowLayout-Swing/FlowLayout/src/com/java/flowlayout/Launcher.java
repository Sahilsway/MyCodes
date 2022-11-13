package com.java.flowlayout;

/* Border layout have some set of rules,
    North and South dosn't change it's height (Specifying minimum size -recomended)
    East and West dosen't change it's width (Specifying minimum size -recomended)
 */

import javax.swing.SwingUtilities;

public class Launcher {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                MainFrame frame = new MainFrame();
                
            }
            
        });
    }
}
