package variables;

public class NumberArgs {
    public static void main(String[] args) {
//        if (args.length == 0) {
//            System.out.println("Brak argumentów");
//            return;
//        }
//        System.out.println("Liczba argumentów: " + args.length);

        int[] numbers = {2, 4, 6, 8, 10};
//        System.out.println("Liczba argumentów: " + numbers.length);
//        printNumbers(numbers);
//        printSquares(numbers);
        printSum(numbers);
    }

    private static void printNumbers(int[] numbers) {
        for (int number : numbers) {
            System.out.print(number + ", ");
        }
        System.out.println();
    }

    private static void printSquares(int[] numbers) {
        for (int number : numbers) {
            System.out.print(Math.pow(number, 2) + ", ");
        }
        System.out.println();
    }

    private static void printSum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum =+ numbers[i];
            System.out.println(sum);
        }
    }
}
