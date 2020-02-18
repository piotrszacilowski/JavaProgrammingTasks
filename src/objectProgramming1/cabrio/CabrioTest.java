package objectProgramming1.cabrio;

public class CabrioTest {
    public static void main(String[] args) {
        Cabrio cabrio = new Cabrio("Mazda","MX-5",true);
        cabrio.setRoofOpen(true);
        System.out.println(cabrio.isRoofOpen());
    }
}
