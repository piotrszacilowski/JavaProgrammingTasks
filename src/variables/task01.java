package variables;

public class task01 {
    public static void main(String[] args) {
        double result = sumOfThree(2.99,3.453,4.213);
        String resultRound = String.format("%.2f", result);
        System.out.println(resultRound);
    }

    public static double sumOfThree(double a, double b, double c) {
        return a + b + c;
    }
}
