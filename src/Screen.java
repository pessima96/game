import javax.swing.*;

public class Screen extends JFrame {
    public Screen() {
     /*   JPanel panel = new JPanel();
        add(panel);*/
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setUndecorated(true);
       /* setVisible(true);
        setVisible(true);*/
     //   setSize(1920, 1080);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
