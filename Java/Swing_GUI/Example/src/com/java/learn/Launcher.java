package com.java.learn;

import java.awt.EventQueue;

public class Launcher {
    public static void main(String[] args) {
        
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                MainFrame frm = new MainFrame();
                frm.show();
                
            }

        });
    }
}
