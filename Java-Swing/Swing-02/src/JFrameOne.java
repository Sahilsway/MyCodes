import javax.swing.JFrame;

public class JFrameOne extends JFrame {

    /****JFrame created by  Inharitance****/
    // In simple word it's public

    public JFrameOne() {
        initialize();
    }

    public void initialize() {
        setTitle("JFrameOne");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(500, 400);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);

    }



}
