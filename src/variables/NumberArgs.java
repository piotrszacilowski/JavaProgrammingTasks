package variables;

public class NumberArgs {
    public static void main(String[] args) {
//        if (args.length == 0) {
//            System.out.println("Brak argumentów");
//            return;
//        }
//        System.out.println("Liczba argumentów: " + args.length);

        int[] numbers = {1, 2, 3, 4, 5};
        printSquares(numbers);
    }

    private static void printSquares(int[] numbers) {
        for (int number : numbers) {
            System.out.println(Math.pow(number, 2) + " ");
        }
    }

    
}
