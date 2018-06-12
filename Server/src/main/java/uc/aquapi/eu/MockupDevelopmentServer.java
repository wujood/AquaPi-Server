package uc.aquapi.eu;

import io.swagger.model.ComponentSettings;
import io.swagger.model.Feeder;
import io.swagger.model.Thermometer;
import io.swagger.model.WaterLevelSensor;

public class MockupDevelopmentServer {

    public static ComponentSettings getValues() {
        ComponentSettings result = new ComponentSettings();

        // Feeder
        Feeder f = new Feeder();
        f.setValue((float) (Math.random() * 10f));
        result.setFeeder(f);

        // WaterLevelSensor
        WaterLevelSensor wls = new WaterLevelSensor();
        wls.setValue((float) (Math.random() * 10f));
        result.setWaterlevelsensor(wls);

        // Thermometer
        Thermometer t = new Thermometer();
        t.setValue((float) (Math.random() * 10f));
        result.setWaterthermometer(t);

        return result;
    }
}
