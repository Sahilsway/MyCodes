package com.java.borderlayout;

/* A border layout can hold no more than a component but lucky us,
   'JPanel' component can hold other components */

import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainFrame {
    
    private JFrame frame;

    public MainFrame() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setTitle("BorderPane Demo");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(800, 500);
        frame.setLocationRelativeTo(null);

        /*No arguments -- No gap between border layouts if we dont specify one it'll be same by default*/
        // frame.setLayout(new BorderLayout());

                                        /*Arguments to specify gaps between Border Layouts (NORTH, SOUTH, WEST, EAST)*/
        frame.setLayout(new BorderLayout(10, 10));
        /*Specifying gap between border layout by instatiating*/
        BorderLayout borderLayout = new BorderLayout();
        borderLayout.setHgap(10);
        borderLayout.setVgap(10);
        frame.setLayout(borderLayout);

        frame.add(new JButton("NORTH"), BorderLayout.NORTH);
        frame.add(new JButton("WEST"), BorderLayout.WEST);
        frame.add(new JButton("EAST"), BorderLayout.EAST);
        frame.add(new JButton("SOUTH"), BorderLayout.SOUTH);
        frame.add(new JButton("CONTER"), BorderLayout.CENTER);
    }

    public void show() {
        this.frame.setVisible(true);
    }

}
