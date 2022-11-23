package com.java.actionlistener;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainFrame implements ActionListener {
    private JFrame frame;
    private JPanel panel;
    private JLabel label;
    private JTextField textField;
    private JButton button;

    public MainFrame() {
        initialize();
    }

    private void initialize() {

        /* JFrame */
        frame = new JFrame();
        frame.setTitle("ActionListener Demo");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(800, 500);
        frame.setLayout(new BorderLayout(10, 10));
        frame.setLocationRelativeTo(null);

        /* JPanel */
        panel = new JPanel();

        /* JLabel */
        label = new JLabel("Enter your name");

        /* JTextField */
        textField = new JTextField(20);

        /* JButton */
        button = new JButton("Save");

        /* Action listener methode to listen for actionEvent */
        // button.addActionListener(new ActionListener() {
        //     @Override
        //     public void actionPerformed(ActionEvent e) {
        //         System.out.println("Clicked");
        //     }
        // });

        /* Listen for actionEvents by registering MainFrame as ActionListener to the button */
        button.addActionListener(this);

        /* Add components to panel */
        panel.add(label);
        panel.add(textField);
        panel.add(button);


        /* Add panel to frame */
        frame.add(panel, BorderLayout.CENTER);

    }


    public void view() {
        this.frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        System.out.println(textField.getText());
    }
}
