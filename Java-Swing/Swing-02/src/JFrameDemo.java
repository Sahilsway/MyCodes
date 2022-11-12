
import javax.swing.SwingUtilities;

public class JFrameDemo {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                // JFrame created by  Inharitance
                // In simple word it's public (not recomended)
                JFrameOne frame1 = new JFrameOne();

                // JFrame created by Composition
                // In simple word it's private (recomended)
                JFrameTwo frame2 = new JFrameTwo();
                
            }
            
        });
    }
}
