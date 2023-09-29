class Test {
    public static void main(String[] args) {
        System.out.println("This is just a demo :-)");
        // kør die 1000 gange
        for (int i = 0; i < 1000; i++) {
            RaffleCup raffleCup = new RaffleCup(new Die[] { new Die(), new Die() });
            int[] result = raffleCup.roll();
            if (result[0] + result[1] <= 12 && result[0] + result[1] >= 2){
                System.out.println("True");
        }
            else {
                System.out.println("False");
                break;
            }
        }
    }
}