package com.java.dynamicjlist;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;


public class MainFrame{

    private int updateIndex;

    public MainFrame() {
        jlist();
    }

    private void jlist() {
        JFrame frame = new JFrame();
        frame.setTitle("Dynamic JList Demo");
        frame.setSize(800, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        /* List panel */
        JPanel listPanel = new JPanel();

        DefaultListModel listItems = new DefaultListModel();
        JList list = new JList(listItems);

        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        /* Panel for list modification */
        JPanel modifyPanel = new JPanel();
        JTextField textField = new JTextField(15);
        JButton add = new JButton("Add");
        JButton update = new JButton("Update");
        JButton delete = new JButton("Delete");

        /* Mouse Listener for the list */
        list.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                updateIndex = list.getSelectedIndex();
                textField.setText((String)listItems.get(updateIndex));
            }
        });
        /* Action listener for add button */
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!textField.getText().toString().isEmpty()){
                    String item = textField.getText().toString();
                    listItems.addElement(item);
                    textField.setText(null);
                }
            }
        });
        /* Action listener for update button */
        update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!textField.getText().toString().isEmpty()){
                    String item = textField.getText().toString();
                    listItems.set(updateIndex, item);
                    textField.setText(null);
                }
            }
        });
        /* Action listener for delete button */
        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listItems.remove(list.getSelectedIndex());
                textField.setText(null);
            }
        });

        listPanel.add(new JScrollPane(list));
        modifyPanel.add(textField);
        modifyPanel.add(add);
        modifyPanel.add(update);
        modifyPanel.add(delete);
        frame.add(modifyPanel, BorderLayout.WEST);
        frame.add(listPanel, BorderLayout.EAST);


    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {

            public void run() {
                new MainFrame();
            }

        });
    }
}
