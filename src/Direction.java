public class Direction {

    private String direction;

    public Direction(String direction) {
        this.direction = direction;
    }

    public String getDirection() {
        return this.direction;
    }

    public Direction rotateLeft() {
        if (direction.equals("N")) {
            direction = "W";
        } else if (direction.equals("S")) {
            direction = "E";
        } else if (direction.equals("W")) {
            direction = "S";
        } else {
            direction = "N";
        }

        return this;
    }

    public Direction rotateRight() {
        if (direction.equals("N")) {
            direction = "E";
        } else if (direction.equals("S")) {
            direction = "W";
        } else if (direction.equals("W")) {
            direction = "N";
        } else {
            direction = "S";
        }

        return this;
    }


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
