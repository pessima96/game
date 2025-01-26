public class Hero {
    private final int SPEED = 10;
    private int x = 100, y = 100;
    private int speedX;
    private Direction direction = Direction.NON;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void update() {
        x += speedX;

    }

    public void moveRight() {
        speedX = SPEED;
        direction = Direction.RIGHT;
    }

    public Direction getDirection() {
        return direction;
    }

    public void stop() {
        speedX = 0;
        direction = Direction.NON;
   }
}
