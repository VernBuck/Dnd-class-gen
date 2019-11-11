public class DarkDragon extends Dragon {
    String darkTransformation = "At the start of combat you can begin channeling an interruptable spell for 3 turns" +
            "If this spell goes uninterrupted you transform into a dragon. On interruption, you may choose to activate " +
            "risky transformation. If you choose to, then you have a 50% chance of transforming. However, whether or not" +
            "this transformation is successful, your current maximum health is divided by 2 for the next four " +
            "encounters.";
    public void darkTransform() {
        System.out.println(darkTransformation);
    }
    public String getPassive() {
        return darkTransformation;
    }
    public void setPassive(String Curses) {
        this.darkTransformation = darkTransformation;
    }
}
