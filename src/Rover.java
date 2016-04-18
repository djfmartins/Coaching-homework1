public class Rover {

    private Direction direction;
    private int y;
    private int x;

    public Rover(int x, int y, String direction) {
        this.direction = Direction.create(direction);
        this.y = y;
        this.x = x;
    }

    public void receive(String commandsSequence) {
        for (int i = 0; i < commandsSequence.length(); ++i) {
            String command = commandsSequence.substring(i, i + 1);

            if (command.equals("l")) {
                rotateLeft();
            } else if (command.equals("r")) {
                rotateRight();
            } else {

                // Displace Rover
                int displacement1 = -1;

                if (command.equals("f")) {
                    displacement1 = 1;
                }
                int displacement = displacement1;

                if (direction.getDirection().equals("N")) {
                    y += displacement;
                } else if (direction.getDirection().equals("S")) {
                    y -= displacement;
                } else if (direction.getDirection().equals("W")) {
                    x -= displacement;
                } else {
                    x += displacement;
                }
            }
        }
    }

    private void rotateLeft() {
        direction = direction.rotateLeft();
    }

    private void rotateRight() {
        direction = direction.rotateRight();
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

        if (direction == null) {
            if (other.direction != null)
                return false;
        } else if (!direction.equals(other.direction))
            return false;

        if (x != other.x)
            return false;

        if (y != other.y)
            return false;

        return true;
    }
}
