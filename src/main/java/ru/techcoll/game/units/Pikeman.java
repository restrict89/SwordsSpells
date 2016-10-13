package ru.techcoll.game.units;

import ru.techcoll.game.AttackType;

/**
 * Юнит ближнего боя - пикинер
 */
public class Pikeman extends Unit {

    /**
     * Начальное значение здоровья
     */
    public final static int HEALTH = 15;

    /**
     * Начальное значение атаки
     */
    public final static int ATTACK = 4;

    /**
     * Начальное значение скорости
     */
    public final static int SPEED = 5;


    public Pikeman(int x, int y) throws Exception{
        super("Pikeman", AttackType.MELEE, x, y);
    }

    public String toString() {
        return String.format("Pikeman @(%d, %d) %d/%d", x, y, attack, health);
    }

}
