import java.util.List;

class RaffleCup {

    private List<Die> dice;

    RaffleCup(List<Die> dice) {
        this.dice = dice;
    }

    /**
     * Rolls all of the dice contained in the RaffleCup object
     * and returns the result of the dice's
     * @return an int[] of the dice results
     */
    public int[] roll() {
        int[] diceResults = new int[dice.size()];
        for (int i = 0; i < dice.size(); i++) {
            diceResults[i] = dice.get(i).getFaceValue();
        }
        return diceResults;
    }
}