package ru.techcoll.game.unitsSettings;

import java.io.InputStream;

/**
 * Created by 1 on 10.10.2016.
 */
public class UnitSettings {

    private UnitInitList unitSettings;// = new UnitInitParser().retrieveFromStream(data);

    public UnitSettings(String settingFile) throws Exception {
        InputStream data = getClass().getClassLoader().getResourceAsStream(settingFile);
        unitSettings = new UnitInitParser().retrieveFromStream(data);
    }

    public UnitInitList getUnitSettings() {
        return unitSettings;
    }


    public UnitInitItem getUnitSettingsForName(String unitName){
        UnitInitItem unitInitItem = new UnitInitItem();
        for(UnitInitItem u:unitSettings.getItems()){
            if (u.getUnitName().equals(unitName))
                unitInitItem = u;
        }
        return unitInitItem;
    }
}

