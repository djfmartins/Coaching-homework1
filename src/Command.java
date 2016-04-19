abstract class Command {

    public static final String LEFT     = "l";
    public static final String RIGHT    = "r";
    public static final String FORWARD  = "f";
    public static final String BACKWARD = "b";

    private String command;

    public Command(String command) {
        this.command = command;
    }

    static Command create(String newCommand) {
        if (newCommand.equals(LEFT)) {
            return new LeftCommand();
        } else if (newCommand.equals(RIGHT)) {
            return new RightCommand();
        } else if (newCommand.equals(FORWARD)) {
            return new ForwardCommand();
        } else {
            return new BackwardsCommand();
        }
    }

    abstract void action(Vector vector);
}
