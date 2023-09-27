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

    // Setting method for points
    public void setPoints() {
        this.points = points;
    }

    // Getting method for ID
    public UUID getId() {
        return id;
    }

}
