public class Bloodorc extends Orc {
    String Warlock = "Can make use of blood magic with 1/2 the HP cost";
    public void rituals() {
        System.out.println(Warlock);
    }
    public String getPassive() {
        return Warlock;
    }
    public void setPassive(String Warlock) {
        this.Warlock = Warlock;
    }
}
