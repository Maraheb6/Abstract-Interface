public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        MovablePoint movablePoint=new MovablePoint(5,7,8,5);
        movablePoint.moveDown();
        movablePoint.moveUp();
        movablePoint.moveRight();
        movablePoint.moveLeft();
    }
}