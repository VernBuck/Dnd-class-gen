public class Magi extends Fairy {
    String FeyAura = "All nearby allies gain +1 to evasion rolls, +2 to perception rolls,";
    public void feyAuraCast() {
        System.out.println(FeyAura);
    }
    public String getPassive() {
        return FeyAura;
    }
    public void setPassive(String massiveBuild) {
        this.FeyAura = FeyAura;
    }
}
