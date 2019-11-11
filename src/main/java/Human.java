public class Human extends Fantasyrace {
    String survival = "Upon fatal blow chance of 1 HP reset";
    public void survivor() {
        System.out.println(survival);
    }
    public String getPassiveBase() {
        return survival;
    }
    public void setPassive(String survival) {
        this.survival = survival;
    }
}
