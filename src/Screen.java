import javax.swing.*;

public class Screen extends JFrame {
    public Screen() {
        JPanel panel = new JPanel();
        add(panel);
        setVisible(true);
        setSize(1920, 1080);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
