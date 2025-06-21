public class Predictor {

    private final double RATE = 0.05;
    private double principalAmount;

    Predictor(int principalAmount) {
        this.principalAmount = principalAmount;
    }

    public double getAmount(int years) {
        if (years == 0) {
            return principalAmount;
        }
        return getAmount(years - 1) * (1 + RATE);
    }
}
