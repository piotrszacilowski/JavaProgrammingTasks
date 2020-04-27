package objectProgramming1.barman;

public class Barman {
    public Drink createDrink(String ingridient1, double amount1,
                             String ingridient2, double amount2,
                             String ingridient3, double amount3) {
        Ingrigient ing1 = new Ingrigient(ingridient1, amount1);
        Ingrigient ing2 = new Ingrigient(ingridient2, amount2);
        Ingrigient ing3 = new Ingrigient(ingridient3, amount3);
        return new Drink(ing1,ing2,ing3);
    }

    public void printDrink(Drink drink) {
        double ingrigientSum = drink.getIng1().getAmount() + drink.getIng2().getAmount() + drink.getIng3().getAmount();

        System.out.println("Składniki drinka to: ");
        System.out.println(drink.getIng1().getName());
        System.out.println(drink.getIng2().getName());
        System.out.println(drink.getIng3().getName());
        System.out.println("\nw proporcjach: ");
        System.out.println(drink.getIng1().getAmount());
        System.out.println(drink.getIng2().getAmount());
        System.out.println(drink.getIng3().getAmount());
        System.out.println("\nJego pojemność całkowita to: " + ingrigientSum);
    }
}
