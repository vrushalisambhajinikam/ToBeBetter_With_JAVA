public class WaterEmptyBuckets_puzzle {

    public static void main(String[] args) {

                int fiveL = 0; // amount in 5L bucket
                int threeL = 0; // amount in 3L bucket

                System.out.println("Start:");
                printStatus(fiveL, threeL);

                // Step 1: Fill 5L bucket
                fiveL = 5;
                System.out.println("\nFill 5L bucket.");
                printStatus(fiveL, threeL);

                // Step 2: Pour 5L -> 3L bucket until 3L is full
                threeL = 3;
                fiveL = fiveL - 3;
                System.out.println("\nPour from 5L into 3L until 3L full.");
                printStatus(fiveL, threeL);

                // Step 3: Empty 3L bucket
                threeL = 0;
                System.out.println("\nEmpty 3L bucket.");
                printStatus(fiveL, threeL);

                // Step 4: Pour remaining 2L from 5L into empty 3L bucket
                threeL = fiveL;
                fiveL = 0;
                System.out.println("\nPour remaining water from 5L into 3L.");
                printStatus(fiveL, threeL);

                // Step 5: Fill 5L bucket again
                fiveL = 5;
                System.out.println("\nFill 5L bucket again.");
                printStatus(fiveL, threeL);

                // Step 6: Pour from 5L into 3L bucket until 3L full
                int spaceLeftIn3L = 3 - threeL;
                fiveL = fiveL - spaceLeftIn3L;
                threeL = 3;
                System.out.println("\nPour into 3L bucket to fill it.");
                printStatus(fiveL, threeL);

                System.out.println("\n✅ You have exactly " + fiveL + " liters in the 5L bucket.");
            }

            private static void printStatus(int fiveL, int threeL) {
                System.out.println("5L bucket: " + fiveL + " liters");
                System.out.println("3L bucket: " + threeL + " liters");



    }
}
