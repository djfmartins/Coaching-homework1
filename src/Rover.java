public class Rover {

    private Vector vector;

    public Rover(int x, int y, String direction) {
        this.vector = new Vector(x, y, direction);
    }

    public void receive(String commandsSequence) {
        for (int i = 0; i < commandsSequence.length(); ++i) {
            Command command = new Command(commandsSequence.substring(i, i + 1));

            if (command.isLeft()) {
                vector.rotateLeft();
            } else if (command.isRight()) {
                vector.rotateRight();
            } else {
                vector.displace(command);
            }
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null)
            return false;

        if (getClass() != obj.getClass())
            return false;

        Rover other = (Rover) obj;

        if (vector == null) {
            if (other.vector != null)
                return false;
        } else if (!vector.equals(other.vector))
            return false;

        return true;
    }
}
