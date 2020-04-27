package objectProgramming1.barman;

public class Drink {
    Ingridient ing1;
    Ingridient ing2;
    Ingridient ing3;

    public Drink(Ingridient ing1, Ingridient ing2, Ingridient ing3) {
        this.ing1 = ing1;
        this.ing2 = ing2;
        this.ing3 = ing3;
    }

    public Ingridient getIng1() {
        return ing1;
    }

    public void setIng1(Ingridient ing1) {
        this.ing1 = ing1;
    }

    public Ingridient getIng2() {
        return ing2;
    }

    public void setIng2(Ingridient ing2) {
        this.ing2 = ing2;
    }

    public Ingridient getIng3() {
        return ing3;
    }

    public void setIng3(Ingridient ing3) {
        this.ing3 = ing3;
    }
}
