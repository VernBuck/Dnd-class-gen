public class Darkelf extends Elf {
    String Curses = "Successful attacks that deal magic damage have a 20% chance of placing curse on an enemy";
    public void darkMagic() {
        System.out.println(Curses);
    }
    public String getPassive() {
        return Curses;
    }
    public void setPassive(String Curses) {
        this.Curses = Curses;
    }
}
