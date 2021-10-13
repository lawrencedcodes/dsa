public class CompoundInterest {
    public static double futureValue(double initialBalance, double interestRate, int years) {
        double futureValue = initialBalance;
        for (int i = 0; i < years; i++) {
            futureValue = futureValue * (1 + interestRate);
        }
        return futureValue;
    }

    public static void main(String[] args) {
        double[][] balance = new double[5][6];
        double[][] interestRate = new double[5][6];
        double[][] years = new double[5][6];
        double[][] futureValue = new double[5][6];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                balance[i][j] = 100 + i * 50;
                interestRate[i][j] = 0.05 + j * 0.01;
                years[i][j] = 1 + i * 2;
                futureValue[i][j] = futureValue(balance[i][j], interestRate[i][j], years[i][j]);
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.printf("$%.2f at %.2f%% for %d years is $%.2f\n", balance[i][j], interestRate[i][j] * 100,
                        years[i][j], futureValue[i][j]);
            }
        }
    }
}
