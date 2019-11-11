public class Catalon extends Beastkin {
    private String catLikeReflex = "For every four successful physical attacks landed, you may make an additional" +
            "roll for attack evasion, in the event that you failed your evasion check. Your stacks are reset to zero" +
            "after the end of combat. Additionally, hiding or going into stealth resets stacks.";
    public void catStacks() {
        System.out.println(catLikeReflex);
    }

    public String getPassive() {
        return catLikeReflex;
    }
    public void setPassive(String catLikeReflex) {
        this.catLikeReflex = catLikeReflex;
    }
}
