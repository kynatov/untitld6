public class Main {



    public static void main(String[] args) {

        Boss boss = new Boss();


        boss.setDamage(100000);
        boss.setHealth(5000);
        boss.setMech(new Weapon("katana", "ace"));


        Skeleton skeleton1 = new Skeleton();

        skeleton1.setArrows(69);
        skeleton1.setDamage(798);
        skeleton1.setHealth(119);
        skeleton1.setMech(new Weapon("roger", " ace"));


        Skeleton skeleton2 = new Skeleton();

        skeleton2.setArrows(60);
        skeleton2.setHealth(1000);
        skeleton2.setDamage(111);
        skeleton2.setMech(new Weapon("roger", "mihouk"));

        System.out.println(boss.printInfo());
        System.out.println(skeleton2.printInfo());
        System.out.println(skeleton1.printInfo());


    }
}