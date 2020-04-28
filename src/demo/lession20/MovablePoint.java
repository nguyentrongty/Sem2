package demo.lession20;

public class MovablePoint implements Movable {

    //instance variable.
    int x, y, xSpeed, ySpeed;

    //Constructor.
    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ") speed =  (" + xSpeed + "," + ySpeed + ")";
    }

    //implement abstract methods declare in the interface movable.
    @Override
    public void moveUp() {
        y -= ySpeed;
    }
    @Override
    public void moveDown() {
        y += ySpeed;
    }
    @Override
    public void moveLeft() {
        x -= xSpeed;
    }
    @Override
    public void moveRight() {
        x += xSpeed;
    }
}
