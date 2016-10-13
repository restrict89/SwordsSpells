package ru.techcoll.game.unitsSettings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by 1 on 13.10.2016.
 */
public class UnitSettingsTest {
    @Test
    public void getUnitSettingsForName() throws Exception {
        UnitSettings unitSettings = new UnitSettings("UnitSetting.xml");
        assertEquals("Count items:",5,unitSettings.getUnitSettings().getItems().size());
        assertTrue("Archer's test: UnitName",unitSettings.getUnitSettingsForName("Archer").getUnitName().equals("Archer"));
        assertTrue("Archer's test: Health", unitSettings.getUnitSettingsForName("Archer").getHealth() == 15);
        assertTrue("Archer's test: Attack",5 == unitSettings.getUnitSettingsForName("Archer").getAttack());
        assertTrue("Archer's test: Speed",5 == unitSettings.getUnitSettingsForName("Archer").getSpeed());

    }

}