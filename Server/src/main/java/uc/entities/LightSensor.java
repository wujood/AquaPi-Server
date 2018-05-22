package uc.entities;

public class LightSensor {

    private float value;

    public LightSensor() {
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public static LightSensor fromSwaggerObject(io.swagger.model.ComponentSettings compSettings)
    {
        LightSensor result = new LightSensor();
        result.setValue(compSettings.getLightSensor().getValue());
        return result;
    }

    public static LightSensor fromSwaggerObject(io.swagger.model.LightSensor swagLightSensor)
    {
        LightSensor result = new LightSensor();
        result.setValue(swagLightSensor.getValue());
        return result;
    }

    public io.swagger.model.LightSensor toSwaggerObject() {
        io.swagger.model.LightSensor result = new io.swagger.model.LightSensor();
        result.setValue(getValue());
        return result;
    }
}