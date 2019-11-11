import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("How many characters to you wish to generate?");

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

        //Rpgcharacter sally = new Rpgcharacter();
        //Rpgcharacter john = new Rpgcharacter();

        //Rpgcharacter sam = new Rpgcharacter(10, 12, 13, 12, 14, 16, "Satyr", "Bard");
    }
}
