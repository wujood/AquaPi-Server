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

    public static WaterFlowSensor fromSwaggerObject(io.swagger.model.ComponentSettings compSettings)
    {
        WaterFlowSensor result = new WaterFlowSensor();
        result.setValue(compSettings.getWaterFlowSensor().getValue());
        return result;
    }

    public static WaterFlowSensor fromSwaggerObject(io.swagger.model.WaterFlowSensor swagWaterFlowSensor)
    {
        WaterFlowSensor result = new WaterFlowSensor();
        result.setValue(swagWaterFlowSensor.getValue());
        return result;
    }

    public io.swagger.model.WaterFlowSensor toSwaggerObject() {
        io.swagger.model.WaterFlowSensor result = new io.swagger.model.WaterFlowSensor();
        result.setValue(getValue());
        return result;
    }
}