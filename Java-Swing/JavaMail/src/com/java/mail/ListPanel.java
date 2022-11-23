package com.java.mail;

import java.awt.BorderLayout;
import java.awt.Insets;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.ListSelectionModel;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class ListPanel {

    private int updateIndex;
    Font lf = new Font("Serief", Font.PLAIN, 15);

    // /* Wishie-Panel */
    public JPanel listPanel() {

        /************List tiltle panel *************/
        JPanel listTitlePanel = new JPanel();
        listTitlePanel.setBackground(Color.BLACK);
        listTitlePanel.setBorder(BorderFactory.createEmptyBorder(5, 20, 5, 20));
        JLabel listTitleL = new JLabel("Your Wishie List");
        listTitleL.setForeground(Color.WHITE);
        listTitleL.setFont(new Font("Ariel", Font.BOLD, 16));
        listTitlePanel.add(listTitleL, BorderLayout.CENTER);

        /************ List Panel ***************/
        JPanel listPanel = new JPanel();
        listPanel.setLayout(new BoxLayout(listPanel, BoxLayout.PAGE_AXIS));
        listPanel.setAlignmentX(listPanel.LEFT_ALIGNMENT);
        // listPanel.setMargin(new Insets(10, 10, 10, 10));
        listPanel.setBackground(Color.BLACK);

        /* Craate button */
        JButton createBtn = new JButton("Create new wishie");
        createBtn.setForeground(Color.WHITE);
        createBtn.setBackground(Color.BLACK);
        createBtn.setFocusable(false);
        // createBtn.setFont(lf);

        /* List */
        JList list = new JList(addListData());
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list.setBackground(Color.BLACK);
        JScrollPane scrollBar = new JScrollPane(list);

        /* Add listSelectionListener */
        listPanel.add(createBtn);
        listPanel.add(list);


        /********** Background panel *************/
        JPanel MainListPanel = new JPanel(new BorderLayout());
        MainListPanel.setMinimumSize(new Dimension(200, 0));
        MainListPanel.setPreferredSize(new Dimension(350, 0));
        MainListPanel.add(listTitlePanel, BorderLayout.NORTH);
        MainListPanel.add(listPanel, BorderLayout.CENTER);

        
        return MainListPanel;
        
    }

    /* getData from form panel and add data to the list */
    private DefaultListModel addListData() {
        FormPanel getList = new FormPanel();

        
        /* ListItems */
        DefaultListModel listItems = new DefaultListModel();         // Increase gridy by 1 for each new listItem
        listItems.addElement("Sahil");                      // Trial listItem
        // listItems.setFont(lf);                                    // setFont method is not working for the list
        // listItems.addElement();                                   // Add listItems dynamically
    
        return listItems;

    }

}
