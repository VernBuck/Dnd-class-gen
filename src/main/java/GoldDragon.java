public class GoldDragon extends Dragon {
    String goldenTransformation = "At the start of combat you can begin channeling an non-interruptable spell for 4 turns" +
            "all damage that you take is doubled. Once you finish channeling this spell you transform into a dragon";
    public void goldTransform() {
        System.out.println(goldenTransformation);
    }
    public String getPassive() {
        return goldenTransformation;
    }
    public void setPassive(String Curses) {
        this.goldenTransformation = goldenTransformation;
    }
}
