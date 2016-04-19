public class RightCommand extends Command {

    public RightCommand()
    {
        super(RIGHT);
    }

    @Override
    void action(Vector vector) {
        vector.rotateRight();
    }
}
