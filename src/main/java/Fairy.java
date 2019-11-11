public class Fairy extends Fantasyrace {
    String tinyBuild = "-4 Strength -4 Endurance +3 on evasion rolls.";
    public void tinyBuildd() {
        System.out.println(tinyBuild);
    }
    public String getPassiveBase() {
        return tinyBuild;
    }
    public void setPassive(String massiveBuild) {
        this.tinyBuild = massiveBuild;
    }
}
