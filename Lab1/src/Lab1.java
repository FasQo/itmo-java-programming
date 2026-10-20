import java.util.Random;

public class Lab1 {
    public static void main(String[] args) {

        int[] z = new int[16];

        for (int i = 0; i < z.length; i++) {
            z[i] = i + 5;
        }

        double[] x = new double[15];
        Random random = new Random();

        for (int j = 0; j < x.length; j++) {
            x[j] = random.nextDouble(-7.0, 13.0);
        }

        double[][] m = new double[z.length][x.length];

        for (int i = 0; i < z.length; i++) {
            for (int j = 0; j < x.length; j++) {
                m[i][j] = calc(z[i], x[j]);
            }
        }

        printMatrix(m);
    }

    public static double calc(int z, double x) {
        return switch (z) {
            case 19 -> Math.pow((1.0 / 3) / ((2.0 / 3) + (1.0 / 2) * Math.cbrt(x)), 2);

            case 5, 10, 14, 15, 16, 17, 18, 20 -> Math.tan(Math.cbrt(Math.cos(x)));

            default -> Math.pow(Math.tan(Math.cos(Math.atan((x + 3.0) / ((Math.E * 2) + 1)))),
                    (Math.log(Math.pow(2 * Math.pow(((Math.PI / 2) * ((Math.abs(x) + 1))), x),
                            2)) * (3 + Math.asin(Math.pow((x + 3.0) / ((Math.E * 2.0) + 1.0), 2)))));
        };
    }

    public static void printMatrix(double[][] m) {
        for (double[] row : m) {
            for (double value : row) {
                System.out.printf(" %8.2f", value);
            }
            System.out.println();
        }
    }
}


