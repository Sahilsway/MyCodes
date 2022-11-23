package com.java.actionlistener;

import java.awt.EventQueue;

public class Launcher {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {

                MainFrame frame = new MainFrame();

                frame.view();
                
            }
            
        });
    }
    
}
