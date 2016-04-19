public class BackwardsCommand extends Command {

    public BackwardsCommand()
    {
        super(BACKWARD);
    }

    @Override
    void action(Vector vector) {
        vector.displaceBackwards();
    }
}
