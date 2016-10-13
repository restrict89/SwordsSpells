package ru.techcoll.game.units;

import ru.techcoll.game.AttackType;

/**
 * Юнит с дальней атакой - лучник
 */
public class Archer extends Unit {
    /**
     * Начальное значение здоровья
     */
    public final static int HEALTH = 15;

    /**
     * Начальное значение атаки
     */
    public final static int ATTACK = 5;

    /**
     * Начальное значение скорости
     */
    public final static int SPEED = 5;


    public Archer(int x, int y) throws Exception{
       super("Archer", AttackType.RANGED, x, y);
           }

    public String toString() {
        return String.format("Archer @(%d, %d) %d/%d", x, y, attack, health);
    }

}
