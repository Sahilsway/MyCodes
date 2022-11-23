package com.java.mail;

import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class HeaderPanel {
    /* Header-Panel */
    public JPanel createHeaderPanel() {

        /* Title Panel */
        JPanel headerPanel = new JPanel();
        headerPanel.setBackground(Color.DARK_GRAY);
        headerPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 15));

        /* Title label */
        JLabel titleLabel = new JLabel("WISHIE");
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setFont(new Font("Sans-serief", Font.BOLD, 25));

        headerPanel.add(titleLabel);
        return headerPanel;
        
    }
}
