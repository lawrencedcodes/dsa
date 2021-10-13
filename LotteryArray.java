public public class LotteryArray {
    public static void main(String[] args) {
        int i;
        int j;
        final int Max_HIGH = 10;
        // allocate triangular array
        int[][] lottery = new int[Max_HIGH][];
        // initialize triangular array
        for (i = 0; i < Max_HIGH; i++) {
            lottery[i] = new int[i + 1];
        }
        // fill triangular array
        for (i = 0; i < Max_HIGH; i++) {
            for (j = 0; j <= i; j++) {
                lottery[i][j] = (int) (Math.random() * 100);
            }
        }
        // display triangular array
        for (i = 0; i < Max_HIGH; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print(lottery[i][j] + " ");
            }
            System.out.println();
        }
    }

}

    public static long lotteryOdds(int high, int number) {
        long r = 1;
        int i;
        for (i = 1; i <= number; i++) {
            r = r * high / i;
            high--;
        }
        return r;
    }

}
