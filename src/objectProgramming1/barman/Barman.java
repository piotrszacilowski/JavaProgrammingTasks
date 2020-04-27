package objectProgramming1.barman;

public class Barman {
    public Drink createDrink(String ingridient1, double amount1,
                             String ingridient2, double amount2,
                             String ingridient3, double amount3) {
        Ingrigient ing1 = new Ingrigient(ingridient1, amount1);
        Ingrigient ing2 = new Ingrigient(ingridient2, amount2);
        Ingrigient ing3 = new Ingrigient(ingridient3, amount3);
        return new Drink();
    }
}
