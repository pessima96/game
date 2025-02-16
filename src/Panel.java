import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Panel extends JPanel implements Runnable {
    private BufferedImage[] imagesHero = new BufferedImage[7];
    private Animation animHero;
    private BufferedImage imageH;

    public Panel(){
        try {
            imageH = ImageIO.read(new File("image/slicing/0.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        animHero = new Animation(false);
        for (int i = 0; i < imagesHero.length; i++) {
            try {
                imagesHero[i] = ImageIO.read(new File("image/slicing/" + i + ".png"));
                animHero.addFrame(imagesHero[i], 50);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        if (imageH != null)
            g.drawImage(imageH, Main.chracter.getX(), Main.chracter.getY(), null);
        g.drawRect(Main.chracter.getRec().x, Main.chracter.getRec().y, Main.chracter.getRec().width,  Main.chracter.getRec().height);
        g.drawRect(Main.floor.x, Main.floor.y, Main.floor.width, Main.floor.height);
    }

    private void update() {
        Main.chracter.update();
    }

    @Override
    public void run() {
        while (true) {
            try{
                if (Main.chracter.getDirection() == Direction.RIGHT)
                    imageH = animHero.getImage();
                animHero.update(20);
                update();
                repaint();


                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
