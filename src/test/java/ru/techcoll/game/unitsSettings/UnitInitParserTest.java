package ru.techcoll.game.unitsSettings;

import org.junit.Test;

import java.io.InputStream;

import static org.junit.Assert.assertEquals;

/**
 * Created by 1 on 10.10.2016.
 */
public class UnitInitParserTest {
    @Test
    public void retrieveFromUrl() throws Exception {
        InputStream data = getClass().getClassLoader().getResourceAsStream("UnitSetting.xml");
        UnitInitList channel = new UnitInitParser().retrieveFromStream(data);
        assertEquals(5, channel.getItems().size());
        /*for(UnitInitItem u:channel.getItems()) {
            assertEquals("Archer",u.getUnitName());
            assertEquals("15",u.getHealth());
            assertEquals("5",u.getAttack());
            assertEquals("5",u.getSpeed());}*/
    }


}