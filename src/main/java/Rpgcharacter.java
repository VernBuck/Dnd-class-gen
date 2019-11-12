import java.util.ArrayList;
import java.util.Random;
import java.util.*;

public class Rpgcharacter {
    String raceVar;
    String classVar;
    public Rpgcharacter() {
        Random rs = new Random();
        int high = 20;
        int low = 8;
        String[] racelist;
        String[] classlist;
        racelist = new String[8];
        classlist = new String[5];

        racelist[0] = "Elf";
        racelist[1] = "Human";
        racelist[2] = "Dwarf";
        racelist[3] = "Orc";
        racelist[4] = "Beastkin";
        racelist[5] = "Etherial";
        racelist[6] = "Dragon";
        racelist[7] = "Fairy";

        classlist[0] = "Ranger";
        classlist[1] = "Warrior";
        classlist[2] = "Mage";
        classlist[3] = "Necromancer";
        classlist[4] = "Cleric";

        int randomValS = rs.nextInt(high-low) + low;
        int randomValD = rs.nextInt(high-low) + low;
        int randomValC = rs.nextInt(high-low) + low;
        int randomValW = rs.nextInt(high-low) + low;
        int randomValI = rs.nextInt(high-low) + low;
        int randomValCh = rs.nextInt(high-low) + low;
        int randomValR = rs.nextInt(7-0) + 0;
        int randomValCL = rs.nextInt(4-0) + 0;

        int raceVariation = rs.nextInt(1-0) + 0;
        int classVariation = rs.nextInt(3-0) + 0;

        int strength = randomValS;
        int dexterity = randomValD;
        int constitution = randomValC;
        int wisdom = randomValW;
        int intelligence = randomValI;
        int charisma = randomValCh;

        String race = racelist[randomValR];
        String clas = classlist[randomValCL];

        ArrayList<Attribute> attributes = new ArrayList<Attribute>();

        attributes.add(new Attribute(strength,dexterity, constitution, wisdom, intelligence, charisma, race, clas, raceVariation));

        for (Attribute z:attributes) {
            System.out.println(z.toString() +" ");
        }

        raceVar = raceComplex(attributes, raceVariation);
        classVar = specialty(attributes, classVariation);
        System.out.println("generated character");
    }

    public String specialty(ArrayList<Attribute> attr, int cv) {

        String[] ploob = {"Ranger","Warrior","Mage", "Necromancer", "Cleric"};
        if ((attr.get(0).getJ()).equals(ploob[0]) && cv == 0) {
            return "Assassin";
        }
        if ((attr.get(0).getJ()).equals(ploob[0]) && cv == 1) {
            return "Trickster";
        }
        if ((attr.get(0).getJ()).equals(ploob[0]) && cv == 2) {
            return "Rogue";
        }
        if ((attr.get(0).getJ()).equals(ploob[0]) && cv == 3) {
            return "Spell Snatcher";
        }
        if ((attr.get(0).getJ()).equals(ploob[1]) && cv == 0) {
            return "Stalwart";
        }
        if ((attr.get(0).getJ()).equals(ploob[1]) && cv == 1) {
            return "Spell Blade";
        }
        if ((attr.get(0).getJ()).equals(ploob[1]) && cv == 2) {
            return "Berserker";
        }
        if ((attr.get(0).getJ()).equals(ploob[1]) && cv == 3) {
            return "Blade Breaker";
        }
        if ((attr.get(0).getJ()).equals(ploob[2]) && cv == 0) {
            return "Elementalist";
        }
        if ((attr.get(0).getJ()).equals(ploob[2]) && cv == 1) {
            return "Spiritualist";
        }
        if ((attr.get(0).getJ()).equals(ploob[2]) && cv == 2) {
            return "Battle Mage";
        }
        if ((attr.get(0).getJ()).equals(ploob[2]) && cv == 3) {
            return "Mage Killer";
        }
        if ((attr.get(0).getJ()).equals(ploob[3]) && cv == 0) {
            return "Witch";
        }
        if ((attr.get(0).getJ()).equals(ploob[3]) && cv == 1) {
            return "Lich";
        }
        if ((attr.get(0).getJ()).equals(ploob[3]) && cv == 2) {
            return "Hex Setter";
        }
        if ((attr.get(0).getJ()).equals(ploob[3]) && cv == 3) {
            return "Dark Knight";
        }
        if ((attr.get(0).getJ()).equals(ploob[4]) && cv == 0) {
            return "Bishop";
        }
        if ((attr.get(0).getJ()).equals(ploob[4]) && cv == 1) {
            return "Paladin";
        }
        if ((attr.get(0).getJ()).equals(ploob[4]) && cv == 2) {
            return "Dark Priest";
        }
        else {
            return "War Monk";
        }
    }

    public String raceComplex(ArrayList<Attribute> attr, int rv) {

        String[] bloob = {"Elf","Human","Dwarf", "Orc", "Beastkin", "Etherial", "Dragon", "Fairy"};

        if ((attr.get(0).getG()).equals(bloob[0]) && rv == 0) {
            return "Dark Elf";
        }
        if ((attr.get(0).getG()).equals(bloob[0]) && rv == 1) {
            return "High Elf";
        }
        if ((attr.get(0).getG()).equals(bloob[1]) && rv == 0) {
            return "Valonian";
        }
        if ((attr.get(0).getG()).equals(bloob[1]) && rv == 1) {
            return "Scionese";
        }
        if ((attr.get(0).getG()).equals(bloob[2]) && rv == 0) {
            return "Knome";
        }
        if ((attr.get(0).getG()).equals(bloob[2]) && rv == 1) {
            return "Warcrafter";
        }
        if ((attr.get(0).getG()).equals(bloob[3]) && rv == 0) {
            return "Blood Orc";
        }
        if ((attr.get(0).getG()).equals(bloob[3]) && rv == 1) {
            return "Sea Orc";
        }
        if ((attr.get(0).getG()).equals(bloob[4]) && rv == 0) {
            return "Catalon";
        }
        if ((attr.get(0).getG()).equals(bloob[4]) && rv == 1) {
            return "Doggra";
        }
        if ((attr.get(0).getG()).equals(bloob[5]) && rv == 0) {
            return "Devil";
        }
        if ((attr.get(0).getG()).equals(bloob[5]) && rv == 1) {
            return "Sephrim";
        }
        if ((attr.get(0).getG()).equals(bloob[6]) && rv == 1) {
            return "Dark Dragon";
        }
        if ((attr.get(0).getG()).equals(bloob[6]) && rv == 0) {
            return "Gold Dragon";
        }
        if ((attr.get(0).getG()).equals(bloob[7]) && rv == 1) {
            return "Magi";
        }
        else {
            return "Lore Master";
        }
    }

    public Rpgcharacter(int s, int d, int co, int w, int i, int ch, String r, String c) {
        int strength = s;
        int dexterity = d;
        int constitution = co;
        int wisdom = w;
        int intelligence = i;
        int charisma = ch;
        String race = r;
        String clas = c;

        ArrayList<Attribute> attributes = new ArrayList<Attribute>();

        attributes.add(new Attribute(strength,dexterity, constitution, wisdom, intelligence, charisma, race, clas));

        for (Attribute z:attributes) {
            System.out.println(z.toString() +" ");
        }

        System.out.println("custom character");
    }


}
