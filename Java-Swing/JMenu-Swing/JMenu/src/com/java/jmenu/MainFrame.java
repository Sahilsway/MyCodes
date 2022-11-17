package com.java.jmenu;

import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.KeyStroke;
import javax.swing.UIManager;

public class MainFrame implements ActionListener {
    
    private JFrame frame;
    private JMenuBar menuBar;
    private JMenu menu;
    private JMenuItem newMenuItem, saveMenuItem, exitMenuItem;

    public MainFrame() {
        initialize();
    }

    private void initialize() {
        /* Main frame of the window */
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

        /* MenuBar < Menu < MenuItem 
        NewMenuItem */
        menuBar = new JMenuBar();
        menu = new JMenu("File");
        /* Setting File menu mnemonic as Alt+F */
        menu.setMnemonic(KeyEvent.VK_F);

        newMenuItem = new JMenuItem("New...");
        /* Setting KeyStroke as Ctrl+N */
        newMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
        ImageIcon icon = new ImageIcon("Images/folder.gif");
        newMenuItem.setIcon(icon);
        newMenuItem.setIconTextGap(10);
        newMenuItem.addActionListener(this);

        /* SaveMenuItem */
        saveMenuItem = new JMenuItem("Save");
        /* Setting KeyStroke as Ctrl+S */
        saveMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
        saveMenuItem.setIconTextGap(10);
        saveMenuItem.addActionListener(this);

        /* ExitMenuItem */
        exitMenuItem = new JMenuItem("Exit");
        /* Setting KeyStroke as Ctrl+E */
        exitMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, ActionEvent.CTRL_MASK));
        exitMenuItem.setIconTextGap(10);
        exitMenuItem.addActionListener(this);

        /* Add menuItem in menu and menu in menuBar */
        menu.add(newMenuItem);
        menu.add(saveMenuItem);

        /* RadioButton
            CheckBox
             SubMenu*/
        menu.add(new JRadioButtonMenuItem("RadioButton"));
        menu.add(new JCheckBoxMenuItem("CheckBox"));
        menu.add(new JMenu("SubMenu"));
     
        menu.addSeparator();

        menu.add(exitMenuItem);
        menuBar.add(menu);

        frame.setJMenuBar(menuBar);

    }

    public void show() {
        this.frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        /* Check who is generating event */
        if (e.getSource() instanceof JMenuItem) {
            JMenuItem item = (JMenuItem) e.getSource();
            String text = item.getText();
            System.out.println(text);
        }
        
    }
}
