public class East extends Direction {

    public East()
    {
        super(EAST);
    }

    public Direction rotateLeft() {
        return Direction.create(NORTH);
    }

    public Direction rotateRight() {
        return Direction.create(SOUTH);
    }
}
