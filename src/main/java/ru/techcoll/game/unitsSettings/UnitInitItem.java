package ru.techcoll.game.unitsSettings;


public class UnitInitItem {

    private String unitName;
    private String health;
    private String attack;
    private String speed;

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public int getHealth() {
        return Integer.parseInt(health);
    }

    public void setHealth(String health) {
        this.health = health;
    }

    public void setAttack(String attack) {
        this.attack = attack;
    }

    public int getAttack() {
        return Integer.parseInt(attack);
    }

    public int getSpeed()
    {
        return Integer.parseInt(speed);
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    @Override
    public String toString()
    {
        return String.format("UnitName: %s, attack: %s, health: %s, speed: %s", this.unitName, this.attack, this.health, this.speed);
    }


}


