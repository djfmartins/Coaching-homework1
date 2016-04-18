public class South extends Direction {

    public South()
    {
        super(SOUTH);
    }

    public Direction rotateLeft() {
        return Direction.create(EAST);
    }

    public Direction rotateRight() {
        return Direction.create(WEST);
    }
}
