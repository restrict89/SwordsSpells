package ru.techcoll.game.units;

import ru.techcoll.game.AttackType;

/**
 * Юнит ближнего боя - рыцарь
 */
public class Knight extends Unit {

    /**
     * Начальное значение здоровья
     */
    public final static int HEALTH = 25;

    /**
     * Начальное значение атаки
     */
    public final static int ATTACK = 7;

    /**
     * Начальное значение скорости
     */
    public final static int SPEED = 9;


    public Knight(int x, int y) throws Exception{
        super("Knight", AttackType.MELEE, x, y);
    }

    public String toString() {
        return String.format("Knight @(%d, %d) %d/%d", x, y, attack, health);
    }

}
