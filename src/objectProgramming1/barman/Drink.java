package objectProgramming1.barman;

public class Drink {
    private Ingridient ingridient1;
    private Ingridient ingridient2;
    private Ingridient ingridient3;

    public Drink(Ingridient ingridient1, Ingridient ingridient2, Ingridient ingridient3) {
        this.ingridient1 = ingridient1;
        this.ingridient2 = ingridient2;
        this.ingridient3 = ingridient3;
    }

    public Ingridient getIngridient1() {
        return ingridient1;
    }

    public void setIngridient1(Ingridient ingridient1) {
        this.ingridient1 = ingridient1;
    }

    public Ingridient getIngridient2() {
        return ingridient2;
    }

    public void setIngridient2(Ingridient ingridient2) {
        this.ingridient2 = ingridient2;
    }

    public Ingridient getIngridient3() {
        return ingridient3;
    }

    public void setIngridient3(Ingridient ingridient3) {
        this.ingridient3 = ingridient3;
    }
}
