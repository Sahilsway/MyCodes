package com.java.mail;

import java.awt.BorderLayout;
// import java.awt.event.ActionEvent;

import javax.swing.JFrame;
// import javax.swing.UIManager;
// import javax.swing.UnsupportedLookAndFeelException;
// import javax.swing.UIManager.LookAndFeelInfo;

// import javax.mail.Message;
// import javax.mail.PasswordAuthentication;
// import javax.mail.Session;
// import javax.mail.internet.InternetAddress;
// import javax.mail.internet.MimeMessage;

public class MainFrame {


    /*********************** List Modification panel *********************/
    // private JPanel listModificationPanel() {
    //     JPanel modificatioPanel = new JPanel();
    //     JTextField textField = new JTextField(15);
    //     JButton add = new JButton("Add");
    //     JButton update = new JButton("Update");
    //     JButton delete = new JButton("Delete");

    //     return modificatioPanel;
    // }

    // /* List-Models */
    // private DefaultListModel listModels() {

    //     return listItems;
    // }



    /* Create the GUI and show it.
        For thread safety, this method should be invoked from the event-dispatching thread
     */
    private void createAndShowWindow() {

        /* Create and set up the window */
        JFrame frame = new JFrame("WISHIE");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        // frame.setMinimumSize(800, 500);

        /* Add panels to the frame */
        HeaderPanel hPanel = new HeaderPanel();
        frame.add(hPanel.createHeaderPanel(), BorderLayout.NORTH);
        FormPanel fPanel = new FormPanel();
        frame.add(fPanel.formPanel(), BorderLayout.CENTER);
        ListPanel lPanel = new ListPanel();
        frame.add(lPanel.listPanel(), BorderLayout.EAST);
        // FooterPanel ftrPanel = new FooterPanel();
        // frame.add(ftrPanel.createFooterPanel(), BorderLayout.SOUTH);

        // frame.pack();   // Sets the frame to only the required size by panels
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
