public class Vector {

    private Direction direction;
    private Point point;

    public Vector(int x, int y, String direction) {
        this.direction = Direction.create(direction);
        this.point = new Point(x, y);
    }

    public void displaceForward() {
        int displacement = 1;

        if (direction.equals(Direction.create(Direction.NORTH))) {
            point.adjustY(displacement);
        } else if (direction.equals(Direction.create(Direction.SOUTH))) {
            point.adjustY(-displacement);
        } else if (direction.equals(Direction.create(Direction.WEST))) {
            point.adjustX(-displacement);
        } else {
            point.adjustX(displacement);
        }
    }

    public void displaceBackwards() {
        int displacement = -1;

        if (direction.equals(Direction.create(Direction.NORTH))) {
            point.adjustY(displacement);
        } else if (direction.equals(Direction.create(Direction.SOUTH))) {
            point.adjustY(-displacement);
        } else if (direction.equals(Direction.create(Direction.WEST))) {
            point.adjustX(-displacement);
        } else {
            point.adjustX(displacement);
        }
    }

    public void rotateLeft() {
        direction = direction.rotateLeft();
    }

    public void rotateRight() {
        direction = direction.rotateRight();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null)
            return false;

        if (getClass() != obj.getClass())
            return false;

        Vector other = (Vector) obj;

        if (direction == null) {
            if (other.direction != null)
                return false;
        } else if (!direction.equals(other.direction))
            return false;

        if (!point.equals(other.point))
            return false;

        return true;
    }
}
