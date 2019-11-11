public class Warcrafter extends Dwarf {
    private String lowAttacks = "Enemy saving throw roll is reduced by 2 versus attack";

    public void lowAttack() {
        System.out.println(lowAttacks);
    }

    public String getPassive() {
        return lowAttacks;
    }
    public void setPassive(String lowAttacks) {
        this.lowAttacks = lowAttacks;
    }
}
