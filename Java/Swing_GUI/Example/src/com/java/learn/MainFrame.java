package com.java.learn;

import javax.swing.JFrame;

public class MainFrame {
    private JFrame Mfrm;

    public MainFrame() {
        initialize();
    }

    private void initialize() {

        Mfrm = new JFrame();
        Mfrm.setTitle("Temp");
        Mfrm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Mfrm.setSize(500, 300);
        Mfrm.setLocationRelativeTo(null);
    }

    public void show() {
        this.Mfrm.setVisible(true);
    }
}
