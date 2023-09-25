import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class GameManager {
    List<Player> players;

    public GameManager(Player[] players) {
        this.players = Arrays.asList(players);

    }

    public Player[] getPlayers() {
        return this.players.toArray(new Player[this.players.size()]);
    }

    public void setPlayers(Player[] players) {
        this.players = Arrays.asList(players);
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    /**
     * Gets the active player, i.e the current player who's turn it is 
     * The active player is the player in index 0 of the players list
     * @return the active player
     */
    public Player getActivePlayer() {
        return this.players.get(0);
    }

    /**
     * Changes the active player, to the next player in the queue
     * Rotates the playes array left, so index 1 becomes index 0, and index 0 becomes index len-1 
     */
    public void nextActivePlayer() {
        Collections.rotate(players, -1);
    }
}