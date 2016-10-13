package ru.techcoll.game.units;

import ru.techcoll.game.AttackType;

/**
 * Юнит кастер - маг
 */
public class Mage extends Unit {

    /**
     * Начальное значение здоровья
     */
    public final static int HEALTH = 10;

    /**
     * Начальное значение атаки
     */
    public final static int ATTACK = 0;

    /**
     * Начальное значение скорости
     */
    public final static int SPEED = 3;


    public Mage(int x, int y) throws Exception{
        super("Mage", AttackType.MAGIC, x, y);
    }

    public String toString() {
        return String.format("Mage @(%d, %d) %d/%d", x, y, attack, health);
    }

}
