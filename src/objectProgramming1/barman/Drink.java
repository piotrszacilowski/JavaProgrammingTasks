package objectProgramming1.barman;

public class Drink {
    Ingrigient ing1;
    Ingrigient ing2;
    Ingrigient ing3;

    public Drink(Ingrigient ing1, Ingrigient ing2, Ingrigient ing3) {
        this.ing1 = ing1;
        this.ing2 = ing2;
        this.ing3 = ing3;
    }

    public Ingrigient getIng1() {
        return ing1;
    }

    public void setIng1(Ingrigient ing1) {
        this.ing1 = ing1;
    }

    public Ingrigient getIng2() {
        return ing2;
    }

    public void setIng2(Ingrigient ing2) {
        this.ing2 = ing2;
    }

    public Ingrigient getIng3() {
        return ing3;
    }

    public void setIng3(Ingrigient ing3) {
        this.ing3 = ing3;
    }
}
