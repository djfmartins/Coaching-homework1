public class West extends Direction {

    public West()
    {
        super(WEST);
    }

    public Direction rotateLeft() {
        return Direction.create(SOUTH);
    }

    public Direction rotateRight() {
        return Direction.create(NORTH);
    }
}
