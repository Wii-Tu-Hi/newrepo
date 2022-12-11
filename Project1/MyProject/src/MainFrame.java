import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class MainFrame extends JFrame{
    public void init() {
        setTitle("Hello");
        setSize(400,300);
        setDefaultCloseOperation((WindowConstants.EXIT_ON_CLOSE));
        setVisible(true);
    }
}
