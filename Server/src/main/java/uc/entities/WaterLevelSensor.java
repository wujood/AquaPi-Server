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

    private String message;
    public String getMessage() {
        return message;
    }

    public void setMessage(String message){
        this.message = message;
    }

    public static WaterLevelSensor fromSwaggerObject(io.swagger.model.ComponentSettings compSettings)
    {
        WaterLevelSensor result = new WaterLevelSensor();
        result.setValue(compSettings.getWaterlevelsensor().getValue());
        result.setMessage(compSettings.getWaterlevelsensor().getMessage());
        return result;
    }

    public static WaterLevelSensor fromSwaggerObject(io.swagger.model.WaterLevelSensor swagWaterLevelSensor)
    {
        WaterLevelSensor result = new WaterLevelSensor();
        // % value
        result.setValue(swagWaterLevelSensor.getValue() / 1023);
        result.setMessage(swagWaterLevelSensor.getMessage());
        return result;
    }

    public io.swagger.model.WaterLevelSensor toSwaggerObject() {
        io.swagger.model.WaterLevelSensor result = new io.swagger.model.WaterLevelSensor();
        result.setValue(getValue());
        result.setMessage(getMessage());
        return result;
    }
}