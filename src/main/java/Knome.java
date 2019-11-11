public class Knome extends Dwarf {
    private String finickyMagic = "All Spells have a 50% chance of failure, however, upon successful cast, you may cast " +
            "another spell at no cost. This passive can chain up to 1 time + (your level / 3)";

    public void chanceTaken() {
        System.out.println(finickyMagic);
    }

    public String getPassive() {
        return finickyMagic;
    }
    public void setPassive(String SwordMastery) {
        this.finickyMagic = finickyMagic;
    }
}
