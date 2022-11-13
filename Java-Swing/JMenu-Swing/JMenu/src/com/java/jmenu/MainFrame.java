package com.java.jmenu;

// import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.UIManager;

//implements ActionListener

public class MainFrame  {
    
    private JFrame frame;
    private JMenuBar menuBar;
    private JMenu menu;
    private JMenuItem newMenuItem, saveMenuItem, exitMenuItem;

    public MainFrame() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setTitle("JMenu Demo");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(800, 500);
        frame.setLayout(new BorderLayout(10, 10));

        /* Font size for menu and menu items */
        Font f = new Font("sans-serief", Font.PLAIN, 18);
        UIManager.put("MenuItem.font", f);
        UIManager.put("CheckBoxMenuItem.font", f);
        UIManager.put("RadioButtonMenuItem.font", f);

        /* MenuBar < Menu < MenuItem */
        menuBar = new JMenuBar();
        menu = new JMenu("File");
        newMenuItem = new JMenuItem("New...");
        saveMenuItem = new JMenuItem("Save");
        exitMenuItem = new JMenuItem("Exit");

        menu.add(newMenuItem);
        menu.add(saveMenuItem);
        menu.add(exitMenuItem);
        menuBar.add(menu);

        frame.setJMenuBar(menuBar);

    }

    public void show() {
        this.frame.setVisible(true);
    }
}
