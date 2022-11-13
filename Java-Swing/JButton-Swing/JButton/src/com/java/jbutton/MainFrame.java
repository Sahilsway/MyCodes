package com.java.jbutton;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class MainFrame {
    private JFrame frame;
    private JPanel panel;
    private JButton button;

    public MainFrame() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();


        frame.setTitle("JButton Demo");
        frame.setSize(800, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        panel = new JPanel();

        button = createButton();

        panel.add(button);


        frame.add(panel, BorderLayout.CENTER);
    }

    private JButton createButton() {
        JButton button = new JButton("Print");
        /* Remove focus from component (Remove dotted circle around the button) */
        button.setFocusable(false);

        /* Graphic for button */
        ImageIcon printIcon = new ImageIcon("button.png");
        button.setIcon(printIcon);
        /* Space between graphic and text of button */
        button.setIconTextGap(2);

        /* Setting key event */
        button.setMnemonic(KeyEvent.VK_P);

        /* Tool tips text */
        button.setToolTipText("xyz function");

        /* Set font */
        button.setFont(new Font("Arial", Font.PLAIN, 8));

        /* button margin */
        button.setMargin(new Insets(10, 10, 10, 10));

        /* Action listener */
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Clicked");                
            }
        });

        /* Enable or Disable button */
        // button.setEnabled(false);

        /* Click button automaticaly */
        // button.doClick();

        /* Change positioning of text and graphic of button */
        button.setVerticalTextPosition(SwingConstants.CENTER);
        button.setHorizontalTextPosition(SwingConstants.LEFT);

        /* Set size of button */
        button.setPreferredSize(new Dimension(100, 20));

        return button;
    }

    public void show() {
        this.frame.setVisible(true);

    }
}
