package com.java.mail;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.KeyEvent;

import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;

public class FormPanel {

    /* Form Panel */
    public JPanel formPanel() {
        JPanel formPanel = new JPanel(new GridBagLayout());
        formPanel.setBackground(Color.GRAY);
        formPanel.setBorder(new EmptyBorder(10, 10, 10, 30));
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(10, 10, 10, 10);
        c.anchor = GridBagConstraints.FIRST_LINE_START;
        Font f = new Font("Ariel", Font.BOLD, 12);
        Font s = new Font("Serief", Font.PLAIN, 15);

        // c.gridx = GridBagConstraints.RELATIVE;
        // c.gridy = GridBagConstraints.RELATIVE;

        /* Wishie rechiever's name */
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 1;
        JLabel nameL = new JLabel("Name of rechiever");
        nameL.setFont(f);
        formPanel.add(nameL, c);
        c.gridx = 1;
        c.gridwidth = GridBagConstraints.REMAINDER;
        JTextField nameTF = new JTextField(20);
        nameTF.setFont(f);
        nameTF.setMargin(new Insets(3, 6, 3, 6));
        formPanel.add(nameTF, c);
        /* Wishie sender */
        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 1;
        JLabel senderL = new JLabel("Your Email");
        senderL.setFont(f);
        formPanel.add(senderL, c);
        c.gridx = 1;
        c.gridwidth = GridBagConstraints.REMAINDER;
        JTextField senderTF = new JTextField(25);
        senderTF.setMargin(new Insets(3, 6, 3, 6));
        senderTF.setFont(f);
        formPanel.add(senderTF, c);
        /* Sender Password */
        c.gridx = 0;
        c.gridy = 2;
        c.gridwidth = 1;
        JLabel senderPL = new JLabel("Password");
        senderPL.setFont(f);
        formPanel.add(senderPL, c);
        c.gridx = 1;
        c.gridwidth = GridBagConstraints.REMAINDER;
        JPasswordField senderPF = new JPasswordField(15);
        senderPF.setMargin(new Insets(3, 6, 3, 6));
        senderPF.setFont(f);
        formPanel.add(senderPF, c);
        /* Wishie rechiever */
        c.gridx = 0;
        c.gridy = 3;
        c.gridwidth = 1;
        JLabel rechieverL = new JLabel("Email of rechiever");
        rechieverL.setFont(f);
        formPanel.add(rechieverL, c);
        c.gridx = 1;
        c.gridwidth = GridBagConstraints.REMAINDER;
        JTextField rechieverTF = new JTextField(25);
        rechieverTF.setMargin(new Insets(3, 6, 3, 6));
        rechieverTF.setFont(f);
        formPanel.add(rechieverTF, c);
        /* Wishie occasion */
        c.gridx = 0;
        c.gridy = 4;
        c.gridwidth = 1;
        JLabel occasionL = new JLabel("Occasion");
        occasionL.setFont(f);
        formPanel.add(occasionL, c);
        c.gridx = 1;
        c.gridwidth = GridBagConstraints.REMAINDER;
        JTextField occasionTF = new JTextField(20);
        occasionTF.setMargin(new Insets(3, 6, 3, 6));
        occasionTF.setFont(f);
        formPanel.add(occasionTF, c);
        /* Wishie Greeting */
        c.gridx = 0;
        c.gridy = 5;
        c.gridwidth = 1;
        JLabel msgL = new JLabel("Message");
        msgL.setFont(f);
        formPanel.add(msgL, c);
        c.gridx = 1;
        c.gridwidth = GridBagConstraints.REMAINDER;
        JTextArea msgTF = new JTextArea(7, 20);
        msgTF.setMargin(new Insets(3, 6, 3, 6));
        msgTF.setWrapStyleWord(true);
        msgTF.setLineWrap(true);
        msgTF.setFont(f);
        formPanel.add(msgTF, c);
        /* Form Save Button */
        c.gridx = 1;
        c.gridy = 6;
        c.anchor = GridBagConstraints.LINE_END;
        JButton saveBTN = new JButton("Save");
        saveBTN.setBorder(null);
        saveBTN.setFocusable(false);
        saveBTN.setMnemonic(KeyEvent.VK_S);
        c.gridheight = GridBagConstraints.REMAINDER;
        saveBTN.setFont(s);
        saveBTN.setPreferredSize(new Dimension(50, 20));
        formPanel.add(saveBTN, c);

        return formPanel;

    }
}
