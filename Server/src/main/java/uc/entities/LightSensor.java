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

    private String message;
    public String getMessage() {
        return message;
    }

    public void setMessage(String message){
        this.message = message;
    }

    public static LightSensor fromSwaggerObject(io.swagger.model.ComponentSettings compSettings)
    {
        LightSensor result = new LightSensor();
        result.setValue(compSettings.getLightsensor().getValue());
        result.setMessage(compSettings.getLightsensor().getMessage());
        return result;
    }

    public static LightSensor fromSwaggerObject(io.swagger.model.LightSensor swagLightSensor)
    {
        LightSensor result = new LightSensor();
        //
        result.setValue((1023.0f - swagLightSensor.getValue())*10.0f/swagLightSensor.getValue());
        result.setMessage(swagLightSensor.getMessage());
        return result;
    }

    public io.swagger.model.LightSensor toSwaggerObject() {
        io.swagger.model.LightSensor result = new io.swagger.model.LightSensor();
        result.setValue(getValue());
        result.setMessage(getMessage());
        return result;
    }
}