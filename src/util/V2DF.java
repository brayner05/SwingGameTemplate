package util;

/**
 * 2D Vector of type Float.
 */
public class V2DF {
    private float x;
    private float y;

    public V2DF() {
        this(0, 0);
    }

    public V2DF(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "[" + x + ", " + y + "]";
    }
}
