public class Valonian extends Human{
    private String swordMastery = "Minimum of B rank Swordsmanship";

    public void swordMaster() {
        System.out.println(swordMastery);
    }

    public String getPassive() {
        return swordMastery;
    }
    public void setPassive(String SwordMastery) {
        this.swordMastery = swordMastery;
    }

}
