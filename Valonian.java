public class Valonian extends Human{
    private String swordMastery = "Minimum of B rank Swordsmanship";

    public void swordMaster() {
        System.out.println(swordMastery);
    }

    public String getSwordMastery() {
        return swordMastery;
    }
    public void setSkill(String SwordMastery) {
        this.swordMastery = swordMastery;
    }

}
