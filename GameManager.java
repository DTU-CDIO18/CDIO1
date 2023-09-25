import java.util.Arrays;
import java.util.List;

class Player {}

public class GameManager {
    List<Player> players;

    public GameManager(Player[] players) {
        this.players = Arrays.asList(players);

    }

    public Player[] getPlayers() {
        return this.players.toArray(new Player[this.players.size()]);
    }
}