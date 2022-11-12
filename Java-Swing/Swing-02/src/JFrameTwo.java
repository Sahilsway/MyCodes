
import javax.swing.JFrame;
    
public class JFrameTwo {

    /****JFrame created by  Conmosition****/
    // In simple word it's private

    private JFrame frame;

    public JFrameTwo() {
        initialize();
    }

    public void initialize() {
        frame = new JFrame();
        this.frame.setTitle("JFrameTwo");
        this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.frame.setSize(500, 400);
        this.frame.setResizable(false);
        this.frame.setLocationRelativeTo(null);
        this.frame.setVisible(true);
    }

}
