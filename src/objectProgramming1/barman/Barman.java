package objectProgramming1.barman;

public class Barman {
    public Drink createDrink(String ingridient1, double amount1,
                             String ingridient2, double amount2,
                             String ingridient3, double amount3) {
        Ingridient ing1 = new Ingridient(ingridient1, amount1);
        Ingridient ing2 = new Ingridient(ingridient2, amount2);
        Ingridient ing3 = new Ingridient(ingridient3, amount3);
        return new Drink(ing1,ing2,ing3);
    }

    public void printDrink(Drink drink) {
        double ingridientSum = drink.getIng1().getAmount() + drink.getIng2().getAmount() + drink.getIng3().getAmount();

        System.out.println("Składniki drinka to: ");
        System.out.println(drink.getIng1().getName());
        System.out.println(drink.getIng2().getName());
        System.out.println(drink.getIng3().getName());
        System.out.println("\nw proporcjach: ");
        System.out.println(drink.getIng1().getAmount());
        System.out.println(drink.getIng2().getAmount());
        System.out.println(drink.getIng3().getAmount());
        System.out.println("\nJego pojemność całkowita to: " + ingridientSum);
    }
}
