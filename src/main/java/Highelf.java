public class Highelf extends Elf {
    String Protection = "Total amount of HP healed increased by ";
    public void lightMagic() {
        System.out.println(Protection);
    }
    public String getPassive() {
        return Protection;
    }
    public void setPassive(String Protection) {
        this.Protection = Protection;
    }
}
