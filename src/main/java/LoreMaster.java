public class LoreMaster extends Fairy {
    String spiritKnowledge = "All non-Etherial languages are understood. All text memorized on touch (includes tomes).";
    public void spirit() {
        System.out.println(spiritKnowledge);
    }
    public String getPassive() {
        return spiritKnowledge;
    }
    public void setPassive(String massiveBuild) {
        this.spiritKnowledge = spiritKnowledge;
    }
}
