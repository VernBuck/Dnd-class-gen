public class Beastkin extends Fantasyrace {
    String enhancedSmell = "Given the opportunity to roll olfactory perception checks at x2 normal distance";
    public void scentCheck() {
        System.out.println(enhancedSmell);
    }
    public String getPassiveBase() {
        return enhancedSmell;
    }
    public void setPassive(String poisonImmunity) {
        this.enhancedSmell = enhancedSmell;
    }
}
