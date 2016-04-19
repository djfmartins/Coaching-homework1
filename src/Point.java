public class Point {
    private int y;
    private int x;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void adjustX(int displacement) {
        this.x += displacement;
    }

    public void adjustY(int displacement) {
        this.y += displacement;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null)
            return false;

        if (getClass() != obj.getClass())
            return false;

        Point other = (Point) obj;

        if (x != other.x)
            return false;

        if (y != other.y)
            return false;

        return true;
    }
}
