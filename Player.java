import java.util.UUID;

public class Player {

    private String name;
    private UUID id;
    private int points;

    // The constructor
    public Player(String name) {
        this.name = name;
        this.points = 0;
        this.id = UUID.randomUUID();
    }

    // Getting method for points
    public int getPoints() {
        return points;
    }

    static int getPoints() {

    }

    static void setPoints() {

    }
}
