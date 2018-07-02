package uc.entities;

public class WaterFlowSensor {

    private float value;

    public WaterFlowSensor() {
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

    public static WaterFlowSensor fromSwaggerObject(io.swagger.model.ComponentSettings compSettings)
    {
        WaterFlowSensor result = new WaterFlowSensor();
        result.setValue(compSettings.getWaterflowsensor().getValue());
        result.setMessage(compSettings.getWaterflowsensor().getMessage());
        return result;
    }

    public static WaterFlowSensor fromSwaggerObject(io.swagger.model.WaterFlowSensor swagWaterFlowSensor)
    {
        WaterFlowSensor result = new WaterFlowSensor();
        result.setValue(swagWaterFlowSensor.getValue());
        result.setMessage(swagWaterFlowSensor.getMessage());
        return result;
    }

    public io.swagger.model.WaterFlowSensor toSwaggerObject() {
        io.swagger.model.WaterFlowSensor result = new io.swagger.model.WaterFlowSensor();
        result.setValue(getValue());
        result.setMessage(getMessage());
        return result;
    }
}