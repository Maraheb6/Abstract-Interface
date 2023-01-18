public class MovablePoint implements Movable {
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
        System.out.println(y-=ySpeed);
    }

    @Override
    public void moveDown() {
       System.out.println(y+=ySpeed);

    }

    @Override
    public void moveLeft() {
        System.out.println(x-=xSpeed);
    }

    @Override
    public void moveRight() {
       System.out.println(x+=xSpeed);
    }


}
