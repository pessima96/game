import java.awt.*;

public class Hero {
    private final int SPEED = 10;
    private int x = 100, y = 100;
    private int speedX;
    private Rectangle rec = new Rectangle(x, y, 100, 50);
    private Direction direction = Direction.NON;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Rectangle getRec() {
        return rec;
    }

    public void update() {
        x += speedX;
        rec.setBounds(x, y, 100, 50);
    }

    public void moveRight() {
        speedX = SPEED;
        direction = Direction.RIGHT;
    }

    public void moveLeft() {
        speedX = -SPEED;
        direction = Direction.LEFT;
    }

    public Direction getDirection() {
        return direction;
    }

    public void stop() {
        speedX = 0;
        direction = Direction.NON;
    }
}
