package com.java.miglayout;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;

public class MainFrame {
    private JFrame frame;
    private JPanel panel;
    private JLabel fNameL, mNameL, sNameL, addressL;
    private JTextField fNameTF, mNameTF, sNameTF, addressTF;
    
    public MainFrame(){
        initialize();
    }

    private void initialize() {

        frame = new JFrame();
        frame.setTitle("MigLayouut Demo");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(800, 200);

        /* Search for more options in miglayout.com */
        panel = new JPanel(new MigLayout());
        fNameL = new JLabel("First name: ");
        fNameTF = new JTextField(15);
        mNameL = new JLabel("Middle name: ");
        mNameTF = new JTextField(15);
        sNameL = new JLabel("Surname: ");
        sNameTF = new JTextField(15);
        addressL = new JLabel("Adress: ");
        addressTF = new JTextField(15);

        /* Add MigLayout components to the panel */
        panel.add(fNameL);
        panel.add(fNameTF);
        panel.add(mNameL, "gap unrelated");
        panel.add(mNameTF, "wrap");
        panel.add(sNameL, "gap unrelated");
        panel.add(sNameTF, "wrap");
        panel.add(addressL);
        panel.add(addressTF, "span", "grow");
        panel.add(new JButton("Submit"));


        frame.add(panel, BorderLayout.CENTER);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
