public class Elf extends Fantasyrace{
    String enhancedHearing = "Given the opportunity to roll auditory perception checks at x2 normal distance";
    public void hearing() {
        System.out.println(enhancedHearing);
    }
    public String getPassiveBase() {
        return enhancedHearing;
    }
    public void setPassive(String enhancedHearing) {
        this.enhancedHearing = enhancedHearing;
    }
}
