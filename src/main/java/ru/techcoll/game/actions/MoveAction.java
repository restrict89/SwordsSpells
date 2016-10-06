package ru.techcoll.game.actions;

import ru.techcoll.game.Battlefield;
import ru.techcoll.game.units.Unit;


public class MoveAction extends Action {

    private int x;
    private int y;
    private Unit movingUnit;
    private Battlefield battlefield;

    public MoveAction(Battlefield battlefield, Unit movingUnit, int x, int y) {
        this.battlefield = battlefield;
        this.movingUnit = movingUnit;
        this.x = x;
        this.y = y;
    }

    @Override
    public void execute() {
        // С учетом Griffin ~ бесконечной скорости
        if (!battlefield.canMoveTo(movingUnit, x, y)) {
            return;
        }
        movingUnit.setPosition(x, y);
    }
}
