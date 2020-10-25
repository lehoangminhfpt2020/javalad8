package lad8.SupperShape;

public class TestSupperShape {
    public static void main(String[] args) {
        Circle ok = new Circle(234,"blue",true);
        Rectangle okem = new Rectangle(345,234,"red",true);
        Shape okanh = new Shape();

        okanh.setColor("red");
        okanh.setFilled(true);

        System.out.println(ok);
        System.out.println(okanh);
        System.out.println(okem);

    }
}
