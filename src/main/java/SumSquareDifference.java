public class SumSquareDifference {

    public double sumOfTheSquares(double sequenceAmount) {
        double sum = 0;
        for (int i = 1; i < sequenceAmount + 1; i++) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    public double squareOfTheSum(double sequenceAmount) {
        double sum = 0;
        for (int i = 1; i < sequenceAmount + 1; i++) {
            sum += i;
        }
        return Math.pow(sum, 2);
    }

    public long difference(double sequenceAmount) {
        return (long) (squareOfTheSum(sequenceAmount) - sumOfTheSquares(sequenceAmount));
    }

}
