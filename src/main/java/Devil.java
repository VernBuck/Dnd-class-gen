public class Devil extends Etherial {
    private String corruption = "For each attack landed, you have a 5% chance of turning any target into a familiar" +
            ". This ability can be used on allies or enemies. You may only have 1 familiar at a time. A " +
            "familiar must make a freewill roll against its corruptor if it wishes to make an independent action. " +
            "A successful action requires that the familiar roll 5 higher than the corruptor.";
    public void corrupt() {
        System.out.println(corruption);
    }

    public String getPassive() {
        return corruption;
    }
    public void setPassive(String corruption) {
        this.corruption = corruption;
    }

}
