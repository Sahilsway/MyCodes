package com.java.jcheckbox;

import java.awt.event.KeyEvent;
import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class MainFrame {

    private JFrame frame;
    private JPanel panel;
    private JCheckBox checkBox;

    public MainFrame() {
        initialize();
    }

    private void initialize() {

        frame = new JFrame();
        frame.setTitle("JCheckBox Demo");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(800, 500);
        frame.setLayout(new BorderLayout(10, 10));
        frame.setLocationRelativeTo(null);

        /* Change Font and FontSize for menu and menuItem */
        Font f = new Font("sans-serief", Font.PLAIN, 24);
        UIManager.put("CheckBox", f);

        panel = new JPanel();
        checkBox = new JCheckBox();
        checkBox.setText("CheckBox");
        System.out.println(checkBox.getText());
        checkBox.setMnemonic(KeyEvent.VK_C);

        panel.add(checkBox);

        frame.add(panel);
    }


    public void show() {
        this.frame.setVisible(true);
    }
    
}
