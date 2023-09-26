class Die {
    private int faceCount = 6;

    public int getFaceValue() {
        return (int) (Math.random() * this.faceCount) + 1;
    }
}