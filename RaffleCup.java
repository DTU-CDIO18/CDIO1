
class RaffleCup {

    private Die[] dice;

    RaffleCup(Die[] dice) {
        this.dice = dice;
    }

    /**
     * Rolls all of the dice contained in the RaffleCup object
     * and returns the result of the dice's
     * @return an int[] of the dice results
     */
    public int[] roll() {
        int[] diceResults = new int[dice.length];
        for (int i = 0; i < dice.length; i++) {
            diceResults[i] = dice[i].getFaceValue();
        }
        return diceResults;
    }
}