import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Main {
    static Hero chracter = new Hero();
    static Floor floor = new Floor();
    public static void main(String[] args) {
        Screen screen = new Screen();
        Panel panel = new Panel();
        Thread thread = new Thread(panel);
        thread.start();

        screen.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);

                switch (e.getKeyCode()) {
                    case KeyEvent.VK_ESCAPE -> System.exit(0);
                    case KeyEvent.VK_D -> chracter.moveRight();
                    case KeyEvent.VK_A -> chracter.moveLeft();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);

                switch (e.getKeyCode()) {
                    case KeyEvent.VK_D -> chracter.stop();
                    case KeyEvent.VK_A -> chracter.stop();
                }
            }
        });

        screen.add(panel);
        screen.setVisible(true);
    }
}