package lad8.Point2D;

public class Point3D extends lab_8.example3.Point2D {
    float z;

    public Point3D() {
        super();
        this.z = 0;
    }

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = 0;
    }

    public float getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public String toString() {
        return "Point3D" +"is (X= " + super.getX() + ",Y=" + super.getY() + ",Z= " + this.z + ")";
    }
}
