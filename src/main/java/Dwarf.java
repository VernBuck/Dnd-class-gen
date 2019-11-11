public class Dwarf extends Fantasyrace{
    String poisonImmunity = "Immune to poison damage";
    public void poisonImmune() {
        System.out.println(poisonImmunity);
    }
    public String getPassiveBase() {
        return poisonImmunity;
    }
    public void setPassive(String poisonImmunity) {
        this.poisonImmunity = poisonImmunity;
    }
}
