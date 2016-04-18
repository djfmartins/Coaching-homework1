abstract class Direction {

    public static final String NORTH = "N";
    public static final String SOUTH = "S";
    public static final String EAST  = "E";
    public static final String WEST  = "W";

    private String direction;

    public Direction(String direction) {
        this.direction = direction;
    }

    public String getDirection() {
        return this.direction;
    }

    static Direction create(String newDirection) {
        if (newDirection.equals(NORTH)) {
            return new North();
        } else if (newDirection.equals(SOUTH)) {
            return new South();
        } else if (newDirection.equals(WEST)) {
            return new West();
        } else {
            return new East();
        }
    }

    public abstract Direction rotateLeft();

    public abstract Direction rotateRight();


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null)
            return false;

        if (getClass() != obj.getClass())
            return false;

        Direction other = (Direction) obj;

        if (direction == null) {
            if (other.direction != null)
                return false;
        } else if (!direction.equals(other.direction))
            return false;

        return true;
    }
}
