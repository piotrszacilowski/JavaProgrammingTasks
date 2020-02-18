package objectProgramming1.cabrio;

public class Cabrio {
    private String brand;
    private String model;
    private boolean move;
    private boolean roofOpen;

    public Cabrio(String brand, String model, boolean move) {
        this.brand = brand;
        this.model = model;
        this.move = move;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isMove() {
        return move;
    }

    public void setMove(boolean move) {
        this.move = move;
    }

    public boolean isRoofOpen() {
        return roofOpen;
    }

    public boolean setRoofOpen(boolean roofOpen) {
        if (move == true) {
            System.out.println("The roof cannot be opened while driving !");
            return false;
        } else {
            this.roofOpen = roofOpen;
        }
        return false;
    }
}
