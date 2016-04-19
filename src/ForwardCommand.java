public class ForwardCommand extends Command {

    public ForwardCommand()
    {
        super(FORWARD);
    }

    @Override
    void action(Vector vector) {
        vector.displaceForward();
    }
}
