public class North extends Direction {

    public North()
    {
        super(NORTH);
    }

    public Direction rotateLeft() {
        return Direction.create(WEST);
    }

    public Direction rotateRight() {
        return Direction.create(EAST);
    }
}
