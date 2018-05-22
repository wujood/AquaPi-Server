package uc.entities;

public class WaterLevelSensor {

    private float value;

    public WaterLevelSensor() {
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public static WaterLevelSensor fromSwaggerObject(io.swagger.model.ComponentSettings compSettings)
    {
        WaterLevelSensor result = new WaterLevelSensor();
        result.setValue(compSettings.getWaterlevelsensor().getValue());
        return result;
    }

    public static WaterLevelSensor fromSwaggerObject(io.swagger.model.WaterLevelSensor swagWaterLevelSensor)
    {
        WaterLevelSensor result = new WaterLevelSensor();
        result.setValue(swagWaterLevelSensor.getValue());
        return result;
    }

    public io.swagger.model.WaterLevelSensor toSwaggerObject() {
        io.swagger.model.WaterLevelSensor result = new io.swagger.model.WaterLevelSensor();
        result.setValue(getValue());
        return result;
    }
}