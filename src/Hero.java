import java.awt.*;

public class Hero {
    private int x = 100, y = 100;
    private int speedX, speedY = Const.SPEED;
    private Rectangle rec = new Rectangle(x, y, Const.CHARACTER_WIDTH + 50, 10);
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
        y += speedY;
        rec.setBounds(x, y + Const.CHARACTER_HEIGHT + 40, Const.CHARACTER_WIDTH, 10);
        collision();
        flyDown();
    }

    private void collision() {
        if (rec.intersects(Main.floor)) {
            y = Main.floor.y - Const.CHARACTER_HEIGHT - 50;
        }
    }

    public void moveRight() {
        speedX = Const.SPEED;
        direction = Direction.RIGHT;
    }

    public void moveLeft() {
        speedX = -Const.SPEED;
        direction = Direction.LEFT;
    }

    public void moveJump(){
        if (rec.intersects(Main.floor)) {
            speedY -= 100;
            direction = Direction.JUMP;
        }
    }

    public void flyDown(){
        speedY = Const.SPEED;
    }

    public Direction getDirection() {
        return direction;
    }

    public void stop() {
        speedX = 0;
        speedY = 0;
        direction = Direction.NON;
    }
}
