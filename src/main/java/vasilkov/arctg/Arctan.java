package vasilkov.arctg;


public class Arctan {
    /*
     * arctan(x)= sum[(-1)^t-1  *  x^(2t-1)/2t-1] t from 1 no inf, |x|<1
     */
    public static double calc(double x, int n) {

        double result = 0;

        for (int i = 1; i < n; i++) {

            if (Double.isNaN(result)) {
                return Double.NaN;
            }

            result = result +
                    Math.pow(-1, i - 1) *
                            Math.pow(x, 2 * i - 1) / (2 * i - 1);


        }
        return result;
    }
}
