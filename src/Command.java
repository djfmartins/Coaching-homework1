public class Command {

    public static final String LEFT     = "l";
    public static final String RIGHT    = "r";
    public static final String FORWARD  = "f";
    public static final String BACKWARD = "b";

    private String command;

    public Command(String command) {
        this.command = command;
    }

    public boolean isLeft() {
        return command.equals(LEFT);
    }

    public boolean isRight() {
        return command.equals(RIGHT);
    }

    public boolean isForward() {
        return command.equals(FORWARD);
    }

    public boolean isBackward() {
        return command.equals(BACKWARD);
    }
}
