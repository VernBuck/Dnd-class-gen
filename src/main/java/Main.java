import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Do you wish to generate a custom character?");
        Scanner scanLineCustom = new Scanner(System.in);
        String strCust = scanLineCustom.nextLine();
        if (strCust.equalsIgnoreCase("y")  || strCust.equalsIgnoreCase("yes")) {
            System.out.println("Please enter your character's Strength Stat");
            Scanner scanStr = new Scanner(System.in);
            int str = scanStr.nextInt();
            System.out.println("Please enter your character's Dexterity Stat");
            Scanner scanDex = new Scanner(System.in);
            int dex = scanDex.nextInt();
            System.out.println("Please enter your character's Constitution Stat");
            Scanner scanCon = new Scanner(System.in);
            int con = scanCon.nextInt();
            System.out.println("Please enter your character's Wisdom Stat");
            Scanner scanWis = new Scanner(System.in);
            int wis = scanWis.nextInt();
            System.out.println("Please enter your character's Intelligence Stat");
            Scanner scanInt = new Scanner(System.in);
            int intel = scanInt.nextInt();
            System.out.println("Please enter your character's Charisma Stat");
            Scanner scanCha = new Scanner(System.in);
            int charisma = scanCha.nextInt();
            System.out.println("Is your character an: Orc, Elf, Dragon, Human, Dwarf, Fairy, Beastkin or Etherial?");
            Scanner scanLineCustom2 = new Scanner(System.in);
            String strCust2 = scanLineCustom2.nextLine();
            System.out.println("What class is your character?");
            Scanner scanLineCustom3 = new Scanner(System.in);
            String strCust3 = scanLineCustom3.nextLine();

            Rpgcharacter bobby = new Rpgcharacter(str, dex, con, wis,intel,charisma, strCust2, strCust3);
            bobby.toString();
        }

        System.out.println("How many random characters to you wish to generate?");

        Scanner scanLine = new Scanner(System.in);
        int number = scanLine.nextInt();

        for (int i = 0; i < number; i++) {
            Rpgcharacter billy = new Rpgcharacter();
            // if (billy.raceVar)
            Fantasyrace billyspecs = new Fantasyrace();

            billyspecs.adventure();

            billyspecs.setName(billy.raceVar);
            System.out.println("Subclass " + billyspecs.getTitle());

            if (billyspecs.getTitle().equals("Valonian")) {
                Valonian vbill = new Valonian();
                String info = vbill.getPassive();
                String baseInfo = vbill.getPassiveBase();
                System.out.println(baseInfo);
                System.out.println(info);
            }
            if (billyspecs.getTitle().equals("Scionese")) {
                Scionese vbill = new Scionese();
                String info = vbill.getPassive();
                String baseInfo = vbill.getPassiveBase();
                System.out.println(baseInfo);
                System.out.println(info);
            }
            if (billyspecs.getTitle().equals("Blood Orc")) {
                Bloodorc vbill = new Bloodorc();
                String info = vbill.getPassive();
                String baseInfo = vbill.getPassiveBase();
                System.out.println(baseInfo);
                System.out.println(info);
            }
            if (billyspecs.getTitle().equals("Sea Orc")) {
                Seaorc vbill = new Seaorc();
                String info = vbill.getPassive();
                String baseInfo = vbill.getPassiveBase();
                System.out.println(baseInfo);
                System.out.println(info);
            }
            if (billyspecs.getTitle().equals("Dark Elf")) {
                Darkelf vbill = new Darkelf();
                String info = vbill.getPassive();
                String baseInfo = vbill.getPassiveBase();
                System.out.println(baseInfo);
                System.out.println(info);
            }
            if (billyspecs.getTitle().equals("High Elf")) {
                Highelf vbill = new Highelf();
                String info = vbill.getPassive();
                String baseInfo = vbill.getPassiveBase();
                System.out.println(baseInfo);
                System.out.println(info);
            }
            if (billyspecs.getTitle().equals("Knome")) {
                Knome vbill = new Knome();
                String info = vbill.getPassive();
                String baseInfo = vbill.getPassiveBase();
                System.out.println(baseInfo);
                System.out.println(info);
            }
            if (billyspecs.getTitle().equals("Warcrafter")) {
                Warcrafter vbill = new Warcrafter();
                String info = vbill.getPassive();
                String baseInfo = vbill.getPassiveBase();
                System.out.println(baseInfo);
                System.out.println(info);
            }
            if (billyspecs.getTitle().equals("Catalon")) {
                Catalon vbill = new Catalon();
                String info = vbill.getPassive();
                String baseInfo = vbill.getPassiveBase();
                System.out.println(baseInfo);
                System.out.println(info);
            }
            if (billyspecs.getTitle().equals("Doggra")) {
                Doggra vbill = new Doggra();
                String info = vbill.getPassive();
                String baseInfo = vbill.getPassiveBase();
                System.out.println(baseInfo);
                System.out.println(info);
            }
            if (billyspecs.getTitle().equals("Devil")) {
                Devil vbill = new Devil();
                String info = vbill.getPassive();
                String baseInfo = vbill.getPassiveBase();
                System.out.println(baseInfo);
                System.out.println(info);
            }
            if (billyspecs.getTitle().equals("Sephrim")) {
                Sephrim vbill = new Sephrim();
                String info = vbill.getPassive();
                String baseInfo = vbill.getPassiveBase();
                System.out.println(baseInfo);
                System.out.println(info);
            }
            if (billyspecs.getTitle().equals("Dark Dragon")) {
                DarkDragon vbill = new DarkDragon();
                String info = vbill.getPassive();
                String baseInfo = vbill.getPassiveBase();
                System.out.println(baseInfo);
                System.out.println(info);
            }
            if (billyspecs.getTitle().equals("Gold Dragon")) {
                GoldDragon vbill = new GoldDragon();
                String info = vbill.getPassive();
                String baseInfo = vbill.getPassiveBase();
                System.out.println(baseInfo);
                System.out.println(info);
            }
            if (billyspecs.getTitle().equals("Magi")) {
                Magi vbill = new Magi();
                String info = vbill.getPassive();
                String baseInfo = vbill.getPassiveBase();
                System.out.println(baseInfo);
                System.out.println(info);
            }
            if (billyspecs.getTitle().equals("Lore Master")) {
                LoreMaster vbill = new LoreMaster();
                String info = vbill.getPassive();
                String baseInfo = vbill.getPassiveBase();
                System.out.println(baseInfo);
                System.out.println(info);
            }
            System.out.println(" ");
            System.out.println(" ");
        }

    }
}
