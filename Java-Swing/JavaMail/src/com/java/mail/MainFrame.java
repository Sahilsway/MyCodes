package com.java.mail;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.ComponentOrientation;
import java.awt.Font;
import java.awt.Color;
import java.awt.Insets;
import java.awt.event.ActionListener;
// import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.DefaultListModel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
// import javax.swing.UIManager;
// import javax.swing.UnsupportedLookAndFeelException;
// import javax.swing.UIManager.LookAndFeelInfo;

// import javax.mail.Message;
// import javax.mail.PasswordAuthentication;
// import javax.mail.Session;
// import javax.mail.internet.InternetAddress;
// import javax.mail.internet.MimeMessage;

public class MainFrame {

    private int updateIndex;

    /* Page-Title */
    private JPanel titlePanel() {

        /***************** Title Panel ********************/
        JPanel titlePanel = new JPanel();
        titlePanel.setBackground(Color.DARK_GRAY);
        titlePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 15));

        /* Title label */
        JLabel titleLabel = new JLabel("WISHIE");
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setFont(new Font("Sans-serief", Font.BOLD, 25));

        titlePanel.add(titleLabel);
        return titlePanel;
        
    }


    /***************** Form Panel ********************/
    private JPanel formPanel() {
        JPanel formPanel = new JPanel(new GridBagLayout());
        formPanel.setBackground(Color.GRAY);
        formPanel.setBorder(new EmptyBorder(10, 10, 50, 10));
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(10, 10, 10, 10);
        c.anchor = GridBagConstraints.FIRST_LINE_START;
        Font f = new Font("Ariel", Font.BOLD, 10);
        Font s = new Font("Serief", Font.PLAIN, 15);

        /* Wishie rechiever's name */
        c.gridy = GridBagConstraints.RELATIVE;
        c.gridwidth = 1;
        JLabel nameL = new JLabel("Name");
        nameL.setFont(f);
        formPanel.add(nameL, c);
        c.gridx = GridBagConstraints.RELATIVE;
        c.gridwidth = GridBagConstraints.REMAINDER;
        JTextField nameTF = new JTextField(20);
        nameTF.setFont(f);
        nameTF.setMargin(new Insets(3, 6, 3, 6));
        formPanel.add(nameTF, c);
        /* Wishie sender */
        c.gridy = GridBagConstraints.RELATIVE;
        c.gridwidth = 1;
        JLabel senderL = new JLabel("From");
        senderL.setFont(f);
        formPanel.add(senderL, c);
        c.gridx = GridBagConstraints.RELATIVE;
        c.gridwidth = GridBagConstraints.REMAINDER;
        JTextField senderTF = new JTextField(20);
        senderTF.setFont(f);
        senderTF.setMargin(new Insets(3, 6, 3, 6));
        formPanel.add(senderTF, c);
        /* Wishie rechiever */
        c.gridy = GridBagConstraints.RELATIVE;
        c.gridwidth = 1;
        JLabel rechieverL = new JLabel("To");
        rechieverL.setFont(f);
        formPanel.add(rechieverL, c);
        c.gridx = GridBagConstraints.RELATIVE;
        c.gridwidth = GridBagConstraints.REMAINDER;
        JTextField rechieverTF = new JTextField(20);
        rechieverTF.setMargin(new Insets(3, 6, 3, 6));
        rechieverTF.setFont(f);
        formPanel.add(rechieverTF, c);
        /* Wishie occasion */
        c.gridy = GridBagConstraints.RELATIVE;
        c.gridwidth = 1;
        JLabel occasionL = new JLabel("Occasion");
        occasionL.setFont(f);
        formPanel.add(occasionL, c);
        c.gridx = GridBagConstraints.RELATIVE;
        c.gridwidth = GridBagConstraints.REMAINDER;
        JTextField occasionTF = new JTextField(20);
        occasionTF.setMargin(new Insets(3, 6, 3, 6));
        occasionTF.setFont(f);
        formPanel.add(occasionTF, c);
        /* Wishie Greeting */
        c.gridy = GridBagConstraints.RELATIVE;
        c.gridwidth = 1;
        JLabel msgL = new JLabel("Message");
        msgL.setFont(f);
        formPanel.add(msgL, c);
        c.gridx = GridBagConstraints.RELATIVE;
        c.gridwidth = GridBagConstraints.REMAINDER;
        JTextArea msgTF = new JTextArea(10, 20);
        msgTF.setMargin(new Insets(3, 6, 3, 6));
        msgTF.setWrapStyleWord(true);
        msgTF.setLineWrap(true);
        msgTF.setFont(f);
        formPanel.add(msgTF, c);
        /* Form Save Button */
        c.anchor = GridBagConstraints.LINE_END;
        JButton saveBTN = new JButton("Save");
        saveBTN.setBorder(null);
        saveBTN.setFocusable(false);
        saveBTN.setMnemonic(KeyEvent.VK_S);
        c.gridheight = GridBagConstraints.REMAINDER;
        saveBTN.setFont(s);
        saveBTN.setPreferredSize(new Dimension(50, 20));
        c.gridx = GridBagConstraints.RELATIVE;
        formPanel.add(saveBTN, c);

        return formPanel;

    }

    /*********************** List Modification panel *********************/
    // private JPanel listModificationPanel() {
    //     JPanel modificatioPanel = new JPanel();
    //     JTextField textField = new JTextField(15);
    //     JButton add = new JButton("Add");
    //     JButton update = new JButton("Update");
    //     JButton delete = new JButton("Delete");

    //     return modificatioPanel;
    // }

    // /* Wishie-Panel */
    private JPanel listPanel() {

        JLabel listTitleL = new JLabel("Your Wishie List");
        listTitleL.setForeground(Color.WHITE);
        listTitleL.setBackground(Color.GRAY);
        listTitleL.setFont(new Font("Sans-serief", Font.BOLD, 10));

        JPanel listPanel = new JPanel();
        listPanel.setBackground(Color.GRAY);
        listPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 6, 15));

        DefaultListModel listItems = new DefaultListModel();
    //     listItems.addElement("Get Text from textfield of listModificationPanel");
        JList list = new JList(listItems);

        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        JScrollPane scrollBar = new JScrollPane(list);

        /* Add listSelectionListener */
        // listPanel.add(listTitleL);
        listPanel.add(list);
        return listPanel;
        
    }

    // /* List-Models */
    // private DefaultListModel listModels() {



    //     return listItems;
    // }

    /******************** Bottom-Panel *********************/
    private JPanel bottomPanel() {

        JPanel bottomPanel = new JPanel();
        bottomPanel.setBackground(Color.DARK_GRAY);
        bottomPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 15));

        JButton createBTN = new JButton("Create new WISHIE");
        createBTN.setForeground(Color.WHITE);
        createBTN.setBackground(Color.BLACK);
        createBTN.setFont(new Font("Sans-serief", Font.BOLD, 20));

        bottomPanel.add(createBTN);
        return bottomPanel;
        
    }

    /* Create the GUI and show it.
        For thread safety, this method should be invoked from the event-dispatching thread
     */
    private void createAndShowWindow() {
        //Create and set up the window.
        JFrame frame = new JFrame("WISHIE");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
 
        /* Set up the content pane */
        frame.add(titlePanel(), BorderLayout.NORTH);
        frame.add(formPanel(), BorderLayout.WEST);
        frame.add(bottomPanel(), BorderLayout.SOUTH);
        frame.add(listPanel(), BorderLayout.EAST);
 
        /* Display the window */
        // frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        /* Creating and showing application's GUI */
        javax.swing.SwingUtilities.invokeLater(new Runnable() {

            // @Override

            // for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
            //     if ("Nimbus".equals(info.getName())) {
            //         try {
            //             UIManager.setLookAndFeel(info.getClassName());
            //         } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
            //                 | UnsupportedLookAndFeelException e) {
            //             e.printStackTrace();
            //         }
            //         break;
            //     };
            // }

            public void run() {
                MainFrame frame = new MainFrame();
                frame.createAndShowWindow();
            }
        });
    }
    
}
