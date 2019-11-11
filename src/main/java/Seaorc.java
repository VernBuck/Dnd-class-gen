public class Seaorc extends Orc {
    String Seafarer = "Can sail a medium size ship or smaller without sailor skill";
    public void sailor() {
        System.out.println(Seafarer);
    }
    public String getPassive() {
        return Seafarer;
    }
    public void setPassive(String Seafarer) {
        this.Seafarer = Seafarer;
    }
}
