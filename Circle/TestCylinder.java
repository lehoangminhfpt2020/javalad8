package lad8.Circle;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder();
        System.out.println("Cylinder:"
                + " radius=" + c1.getRadius()
                + " \n \t height=" + c1.getHeight()
                + " \n \t base area=" + c1.getArea()
                + " \n \t volume=" + c1.getVolume());
    }
}
