package lad8.Movablepoint;

public class TestMovapoint {
    public static void main(String[] args) {
        MovablePoint ok = new MovablePoint(67,234);
        Point okem = new Point(23,23);
        System.out.println("Movablepoint");
        System.out.println(ok);
        System.out.println("point");
        System.out.println(okem);

        System.out.println("move Movablepoint:");
        ok.move();
        ok.setSpeed(343,342);
        System.out.println(ok);

        System.out.println("Move Point:");
        okem.setXY(5,234234);
        System.out.println(okem);
    }
}
