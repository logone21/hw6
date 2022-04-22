package com.company;

public class Boss extends GameEntity {
   private Weapon weapon = new Weapon();

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String printInfo(){
        return "Health: " + getHealth() +
                " Damage: " + getDamage() +
                " type weapon: " + getWeapon().getTypeWeapon() +
                " Name weapon: " + getWeapon().getNameWeapon();
    }

}
