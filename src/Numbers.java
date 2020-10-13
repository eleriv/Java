public class Numbers {

    public void Number() {
        for (int i = 1; i < 11; i++) {
            for (int x = 9 ; x >= 0; x--) {
                int numMax = 10 - i;
                System.out.print(Math.min(numMax, x) + " ");
            }
            System.out.print('\n');
        }
    }
}