public class Main {
    public static void main(String[] args) {

        Rpgcharacter billy = new Rpgcharacter();
        // if (billy.raceVar)
        Fantasyrace billyspecs = new Fantasyrace();

        billyspecs.adventure();

        billyspecs.setName(billy.raceVar);
        System.out.println("Subclass " + billyspecs.getTitle());

        if (billyspecs.getTitle().equals("Valonian")) {
            Valonian vbill = new Valonian();
            vbill.swordMaster();
            vbill.survivor();
        }
        Rpgcharacter sally = new Rpgcharacter();
        Rpgcharacter john = new Rpgcharacter();

        //Rpgcharacter sam = new Rpgcharacter(10, 12, 13, 12, 14, 16, "Satyr", "Bard");
    }
}
