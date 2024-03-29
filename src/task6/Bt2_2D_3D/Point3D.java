package task6.Bt2_2D_3D;

public class Point3D extends Point2D {
    private float z;

    public Point3D() {

    }

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        return new float[] { getX(), getY(), z };
    }

    @Override
    public String toString() {
        return "Point3D [x=" + getX() + ", y=" + getY() + ", z=" + z + "]";
    }

}
