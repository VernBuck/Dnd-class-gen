public class Attribute {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private String g;
    private String j;
    private int r;

    public Attribute(int a, int b, int c, int d, int e, int f, String g, String j, int r) {
        this.a = a;
        this.b = b;
        this.c =c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.j = j;
        this.r = r;
    }

    public Attribute(int a, int b, int c, int d, int e, int f, String g, String j) {
        this.a = a;
        this.b = b;
        this.c =c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.j = j;
        this.r = r;
    }

    public void setA(int newstr) {
        this.a = newstr;
    }

    public void setB(int newdex) {
        this.b = newdex;
    }

    public void setC(int newcon) {
        this.c = newcon;
    }

    public void setD(int newwis) {
        this.d = newwis;
    }

    public void setE(int newint) {
        this.e = newint;
    }

    public void setF(int newwcha) {
        this.f = newwcha;
    }

    public void setG(String newRace) {
        this.g = newRace;
    }

    public void setJ(String newClas) {
        this.j = newClas;
    }

    public void setR(int newClasR) {
        this.r = newClasR;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
    public int getC() {
        return c;
    }
    public int getD() {
        return d;
    }

    public int getE() {
        return e;
    }

    public int getF() {
        return f;
    }

    public String getG() {
        return g;
    }

    public String getJ() {
        return j;
    }

    public int getR() {
        return r;
    }

    @Override
    public String toString() {
        return ("Strength " + this.getA() + " " + "Dexterity " + this.getB() + " " + "Constitution "
                + this.getC() + " " + "Wisdom " + this.getD()+ " " + "Intelligence "+ this.getE()+ " " +
                "Charisma " + this.getF() + " " + "Race " + this.getG() +" "+ "Class " + this.getJ());
    }
}
