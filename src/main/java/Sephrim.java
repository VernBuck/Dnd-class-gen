public class Sephrim extends Etherial {
    private String holyMagic = "For each magic attack taken, you have a 50% chance of reducing the damage taken by half";
    public void holy() {
        System.out.println(holyMagic);
    }

    public String getPassive() {
        return holyMagic;
    }
    public void setPassive(String holyMagic) {
        this.holyMagic = holyMagic;
    }
}
