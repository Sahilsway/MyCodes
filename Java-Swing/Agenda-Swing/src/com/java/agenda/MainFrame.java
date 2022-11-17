package com.java.agenda;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class MainFrame extends JFrame {

    private JLabel firstNameLabel, lastNameLabel, adressLabel, phoneNumberLabel, extraInfoLabel;
    private JButton editButton, addButton, deleteButton, showButton;
    private JPanel labels, gui, buttons;
    private DefaultListModel model;
    private JList list;
    private JMenuBar menuBar;
    private JMenu menu;
    private JMenuItem newItem, saveItem, saveAsItem, exitItem, openItem;
    private Agenda agenda;
    private JScrollPane scrollPane;

    public void AgendaView() {

        menuBar = new JMenuBar();
        menu = new JMenu("Menu");
        menu.add(new JSeparator());
        newItem = new JMenuItem("New");
        saveItem = new JMenuItem("Save");
        saveItem.setEnabled(false);
        saveAsItem = new JMenuItem("Save as..");
        saveAsItem.setEnabled(false);
        exitItem = new JMenuItem("Exit");
        openItem = new JMenuItem("Open");
        saveItem.add(new JSeparator());
        exitItem.add(new JSeparator());
        menu.add(newItem);
        menu.add(openItem);
        menu.add(saveItem);
        menu.add(saveAsItem);
        menu.add(exitItem);

        gui = new JPanel(new BorderLayout(2, 2));
        gui.setBorder(new TitledBorder("Owner"));

        labels = new JPanel(new GridLayout(0, 1, 1, 1));
        labels.setBorder(new TitledBorder("Contact "));

        buttons = new JPanel(new GridLayout(1, 0, 1, 1));

        editButton = new Button("Edit");
        addButton = new Button("Add");
        deleteButton = new Button("Delete");
        showButton = new Button("Show");

        editButton.setEnabled(false);
        addButton.setEnabled(false);
        deleteButton.setEnabled(false);
        showButton.setEnabled(false);

        buttons.add(showButton);
        buttons.add(editButton);
        buttons.add(addButton);
        buttons.add(deleteButton);

        firstNameLabel = new JLabel("First name: ");
        lastNameLabel = new JLabel("Last name: ");
        adressLabel = new JLabel("Adress: ");
        phoneNumberLabel = new JLabel("Phone number: ");
        extraInfoLabel = new JLabel("Extra info: ");

        labels.add(firstNameLabel);
        labels.add(lastNameLabel);
        labels.add(adressLabel);
        labels.add(phoneNumberLabel);
        labels.add(extraInfoLabel);

        model = new DefaultListModel();
        list = new JList(model);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list.setVisibleRowCount(-1);
        list.addListSelectionListener(
                new ListSelectionListener() {
                    @Override
                    public void valueChanged(ListSelectionEvent lse) {
                        String name = list.getSelectedValue().toString();
                        String[] split = name.split(" ");
                        Contact contact = agenda.searchContactbyName(split[0], split[1]);
                        firstNameLabel.setText("First name:   " + contact.getFirstName());
                        lastNameLabel.setText("Last name:   " + contact.getLastName());
                        adressLabel.setText("Adress:   " + contact.getAdress());
                        phoneNumberLabel.setText("Phone number:   " + contact.getPhoneNumber());
                        if (contact.getType().compareTo("Acquaintance") == 0) {
                            extraInfoLabel.setText("Occupation:   " + contact.getExtraInfo());
                        } else if (contact.getType().compareTo("Colleague") == 0) {
                            extraInfoLabel.setText("Email:   " + contact.getExtraInfo());
                        } else if (contact.getType().compareTo("Friend") == 0) {
                            extraInfoLabel.setText("Birthdate:   " + contact.getExtraInfo());
                        } else {
                            extraInfoLabel.setVisible(false);
                        }
                    }
                });

        scrollPane = new JScrollPane(list);

        gui.add(labels, BorderLayout.CENTER);
        gui.add(scrollPane, BorderLayout.WEST);
        gui.add(buttons, BorderLayout.SOUTH);
        add(gui);
        menuBar.add(menu);
        setJMenuBar(menuBar);
        }
    }

// Here is where I display the GUI

    public class JavaLab3_pb1Java {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Agenda agenda = new Agenda();

        AgendaView agendaView = new AgendaView();
        agendaView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        agendaView.setSize(500, 300);
        agendaView.pack();
        agendaView.setVisible(true);

    }
}