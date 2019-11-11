public class Doggra extends Beastkin {
    private String playDead = "Upon being hit by an attack, you may feign death. Each enemy in the area rolls" +
            "a perception check. If they roll above 10 + (your level / 2), each enemy gains an additional attack" +
            "against you and your evasion roll is reduced by 2. If no nearby enemies roll successfully, then their" +
            "aggro is dropped. Some enemies will choose to physically dispose of your body, if the enemy chooses to do so" +
            "your next attack becomes a critical";
    public void rollOver() {
        System.out.println(playDead);
    }

    public String getPassive() {
        return playDead;
    }
    public void setPassive(String playDead) {
        this.playDead = playDead;
    }
}
