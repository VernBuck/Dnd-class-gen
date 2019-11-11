public class Orc extends Fantasyrace{
    String largeBuild = "Add +1 to Constitution and +1 to Strength";
    public void largebuild() {
        System.out.println(largeBuild);
    }
    public String getPassiveBase() {
        return largeBuild;
    }
    public void setPassive(String survival) {
        this.largeBuild = largeBuild;
    }
}
