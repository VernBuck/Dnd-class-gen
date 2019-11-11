public class Scionese extends Human {
    private String poleAxeMastery = "Minimum of B rank spearsmanship";
    public void lanceMaster() {
        System.out.println(poleAxeMastery);
    }
    public String getPassive() {
        return poleAxeMastery;
    }
    public void setPassive(String poleAxeMastery) {
        this.poleAxeMastery = poleAxeMastery;
    }
}
