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

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getting method for points
    public int getPoints() {
        return points;
    }

    // Setting method for points
    public void setPoints(int points) {
        this.points = points;
    }

    public void addPoints(int points) {
        this.points += points;
    }

    // Getting method for ID
    public UUID getId() {
        return this.id;
    }

}
