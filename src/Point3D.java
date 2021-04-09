public class Point3D extends Point2D{
    private float z = 0.0f;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }
    public Point3D() {
    }
    public float getZ() {
        return z;
    }
    public void setZ(float z) {
        this.z = z;
    }
    public float[] getXYZ() {
        float []arr = new float[3];
        arr=super.getXY();
        arr[2]=this.z;
        return arr;
    }
    public void setXYZ(float x, float y, float z){
        this.setXY(x,y);
        this.z = z;
    }
    @Override
    public String toString() {
        return "Point3D{" +
                "x=" + getY() +
                ",y=" + getY() +
                ",z=" + z +
                '}';
    }
}
