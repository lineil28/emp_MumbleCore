public class SearchDriver {
    public static void main(String[] args) {
        final int SIZE = 2000000;// as size increases, the linsearch time increases exponentially.
        final int TRIALS = 1000;//irrelevant when its this high, but good for science //linsearch takes forever with 1000000 trials(supraasrsing minutesns) but binsearch takes about 12 secs
        long start;
        long end;
        Comparable[] test;
//note to self write controls in notes
        test = new Comparable[SIZE];
        for(int i = 0; i < SIZE; i++) {
            test[i] = i;
        }

        int target = (int)(SIZE * Math.random());

        start = System.currentTimeMillis();
        for(int i = 0; i < TRIALS; i++) {
            BinSearch.binSearch(test, target);
        }
        end = System.currentTimeMillis();
        long binSearchTime = end - start;
        System.out.println("BinSearch took " + (end-start) + " milliseconds to do " + TRIALS + " trials.");

        start = System.currentTimeMillis();
        for(int i = 0; i < TRIALS; i++) {
            LinSearch.linSearch(test, target);
        }
        end = System.currentTimeMillis();
        long linSearchTime = end - start;
        System.out.println("LinSearch took " + (end-start) + " milliseconds to do " + TRIALS + " trials.");

        System.out.println("LinSearch took " + (linSearchTime / binSearchTime) + " times longer.");

    }
}
