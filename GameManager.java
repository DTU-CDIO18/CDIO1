
public class GameManager {
    private Player[] players;
    private int activePlayerIndex = 0;

    public GameManager(Player[] players) {
        this.players = players;
    }

    public Player[] getPlayers() {
        return this.players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }

    /**
     * Gets the active player, i.e the current player who's turn it is 
     * The active player is the player in index 0 of the players list
     * @return the active player
     */
    public Player getActivePlayer() {
        return this.players[this.activePlayerIndex];
    }

    /**
     * Changes the active player, to the next player in the queue
     * Adds 1 to activePlayerIndex.
     * If activePlayerIndex < players.length => activePlayerIndex += 1 else activePlayerIndex = 0
     */
    public void nextActivePlayer() {
        this.activePlayerIndex = this.activePlayerIndex < this.players.length-1 ?
                                 this.activePlayerIndex+1 :
                                 0;
    }
}