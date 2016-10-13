package ru.techcoll;

import ru.techcoll.game.Battlefield;
import ru.techcoll.game.actions.*;
import ru.techcoll.game.units.Archer;
import ru.techcoll.game.units.*;


public class Main {

        public static void main(String[] args) throws Exception {
      /*      UnitSettings unitSettings = new UnitSettings("UnitSetting.xml");
         for(UnitInitItem u:unitSettings.getUnitSettings().getItems()) {
                System.out.println(u.toString());
            }

        System.out.printf(unitSettings.getUnitSettingsForName("Archer").toString());*/

        Battlefield bf = new Battlefield();
        Unit archer = bf.addUnit(new Archer(2, 4));
        Unit knight = bf.addUnit(new Knight(4, 6));

        System.out.println("Initial state:");
        bf.printUnits();

        AttackAction attack = new AttackAction(bf, archer, knight);
        attack.execute();

        System.out.println("After attack:");
        bf.printUnits();

        if (bf.canMoveTo(archer, 3, 5))
            System.out.printf("Archer can move to @(%d, %d)\n", 3, 5);
        else
            System.out.printf("It's impossible to move to @(%d, %d)\n", 3, 5);

    }

}
