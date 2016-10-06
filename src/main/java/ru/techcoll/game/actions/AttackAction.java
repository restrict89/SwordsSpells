package ru.techcoll.game.actions;

import ru.techcoll.game.AttackType;
import ru.techcoll.game.Battlefield;
import ru.techcoll.game.units.Unit;

public class AttackAction extends Action {

    private Battlefield battlefield;

    private Unit attacker;

    private Unit defender;

    public AttackAction(Battlefield battlefield, Unit attacker, Unit defender) {
        this.battlefield = battlefield;
        this.attacker = attacker;
        this.defender = defender;
    }

    @Override
    public void execute() {
        if (!battlefield.canAttack(attacker, defender))
            return;

        defender.setHealth(defender.getHealth() - attacker.getAttack());

        if (attacker.getAttackType() == AttackType.MELEE && !defender.isDead())
            attacker.setHealth(attacker.getHealth() - defender.getAttack());
    }

}
