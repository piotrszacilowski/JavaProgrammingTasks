package objectProgramming1.barman;

public class Barman {

    public static Drink createDrink(String ingridient1, double amount1, String ingridient2, double amount2, String ingridient3, double amount3) {
        Ingridient ing1 = new Ingridient(ingridient1,amount1);
        Ingridient ing2 = new Ingridient(ingridient2,amount2);
        Ingridient ing3 = new Ingridient(ingridient3,amount3);
        return new Drink(ing1,ing2,ing3);
    }

    String printDrink(Drink drink) {
        return "Składniki drinka to AAA, BBB, CCC w proporcjach aaa, bbb, ccc, jego pojemność to zzz";
    }
}
