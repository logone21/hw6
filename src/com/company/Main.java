package com.company;

public class Main {

    public static void main(String[] args) {
	Boss boss = new Boss();
    boss.setHealth(200);
    boss.setDamage(50);
    boss.getWeapon().setNameWeapon("sword");
    boss.getWeapon().setTypeWeapon("lopata");
    System.out.println(boss.printInfo());

    Skeleton Skeleton1 = new  Skeleton();
    Skeleton Skeleton2 = new  Skeleton();
    Skeleton1.setHealth(50);
    Skeleton2.setHealth(50);
    Skeleton1.setDamage(10);
    Skeleton2.setDamage(10);
    Skeleton1.setNumberOfArrows(10);
    Skeleton2.setNumberOfArrows(10);

    System.out.println(Skeleton1.printInfo());
    System.out.println(Skeleton2.printInfo());
    }
}
