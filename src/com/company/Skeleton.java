package com.company;

public class Skeleton extends Boss {
    int numberOfArrows;

    public int getNumberOfArrows() {
        return numberOfArrows;
    }

    public void setNumberOfArrows(int numberOfArrows) {
        this.numberOfArrows = numberOfArrows;
    }

    public String printInfo(){
        return "Health: " + getHealth() +
                " Damage: " + getDamage() +
                " type weapon: " + getWeapon().getTypeWeapon() +
                " Name weapon: " + getWeapon().getNameWeapon() +
                " number of arrows: " + getNumberOfArrows();
    }
}
