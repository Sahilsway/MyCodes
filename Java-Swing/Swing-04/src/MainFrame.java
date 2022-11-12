
import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;
// import javax.swing.JPanel;

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

        frame.setLayout(new BorderLayout());
        frame.add(new JButton("NORTH"), BorderLayout.NORTH);

        frame.setLayout(new BorderLayout(10, 10));
        frame.setLocationRelativeTo(null);

    }

    public void show() {
        this.frame.setVisible(true);
    }

}
