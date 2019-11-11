public class Dragon extends Fantasyrace {
    String massiveBuild = "When Transformed: Add +4 to Constitution. +4 to Strength. -6 to Dexterity.";
    public void massiveBuild() {
        System.out.println(massiveBuild);
    }
    public String getPassiveBase() {
        return massiveBuild;
    }
    public void setPassive(String massiveBuild) {
        this.massiveBuild = massiveBuild;
    }
}
