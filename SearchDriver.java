public class SearchDriver {

    public static void testtings(int SIZE, int TRIALS){ // as size increases, the linsearch time increases exponentially.
        long start;
        long end;
        int target = (int)(SIZE * Math.random());
        Comparable[] test;
        test = new Comparable[SIZE];
        for(int i = 0; i < SIZE; i++) {
            test[i] = i;
        }
        System.out.println("size is " + SIZE + ", " + TRIALS + " trial being done.");
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
        if (binSearchTime!=0){
        System.out.println("LinSearch took " + (linSearchTime / binSearchTime) + " times longer.");}
    }
    public static void main(String[] args) {
        testtings(60,10000);
        testtings(600,10000);
        testtings(6000,10000);
        testtings(60000,10000);
        testtings(600000,10000);
        testtings(6000000,10000);
        testtings(60000000,10000);
        testtings(210000000,10000);

        /*
        test = new Comparable[SIZE];
        for(int i = 0; i < SIZE; i++) {
            test[i] = i;
        }

        int target = (int)(SIZE * Math.random());
        System.out.println("size is 60, 100 trials being done.");
        SIZE=60;
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


        System.out.println("size is 1000000, 100 trials being done.");
        SIZE=1000000;
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
*/
    }
}
