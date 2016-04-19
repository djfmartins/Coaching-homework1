public class LeftCommand extends Command {

    public LeftCommand()
    {
        super(LEFT);
    }

    @Override
    void action(Vector vector) {
        vector.rotateLeft();
    }
}
