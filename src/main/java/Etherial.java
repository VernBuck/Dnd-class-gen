public class Etherial extends Fantasyrace {
    String divinity = "You have a 50% chance of seeing 1 target's alignment per encounter. This can be in combat" +
            "or it can be during conversation.";
    public void alignCheck() {
        System.out.println(divinity);
    }
    public String getPassiveBase() {
        return divinity;
    }
    public void setPassive(String divinity) {
        this.divinity = divinity;
    }
}
