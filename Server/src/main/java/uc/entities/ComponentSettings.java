package uc.entities;

import java.util.Date;
public class ComponentSettings {
    private String piId;
    private Date timestamp;
    private WaterFlowSensor waterFlowSensor;
    private LightSensor lightSensor;
    private WaterLevelSensor waterLevelSensor;
    private Thermometer thermometer;
    private Lamp lamp;
    private Feeder feeder;
    private Pump pump;

    public ComponentSettings() {
    }

    public String getPiId() { return piId; }
    public void setPiId(String piId) { this.piId = piId; }

    public Date getTimestamp() { return timestamp; }
    public void setTimestamp(Date timestamp) { this.timestamp = timestamp; }

    public WaterFlowSensor getWaterFlowSensor() { return waterFlowSensor; }
    public void setWaterFlowSensor(WaterFlowSensor waterFlowSensor) { this.waterFlowSensor = waterFlowSensor; }

    public LightSensor getLightSensor() { return lightSensor; }
    public void setLightSensor(LightSensor lightSensor) { this.lightSensor = lightSensor; }

    public WaterLevelSensor getWaterLevelSensor() { return waterLevelSensor; }
    public void setWaterLevelSensor(WaterLevelSensor waterLevelSensor) { this.waterLevelSensor = waterLevelSensor; }

    public Thermometer getThermometer() { return thermometer; }
    public void setThermometer(Thermometer thermometer) { this.thermometer = thermometer; }

    public Lamp getLamp() { return lamp; }
    public void setLamp(Lamp lamp) { this.lamp = lamp; }

    public Feeder getFeeder() { return feeder; }
    public void setFeeder(Feeder feeder) { this.feeder = feeder; }

    public Pump getPump() { return pump; }
    public void setPump(Pump pump) { this.pump = pump; }

    public static ComponentSettings fromSwaggerObject(io.swagger.model.ComponentSettings compSettings)
    {
        ComponentSettings result = new ComponentSettings();
        result.setPiId(compSettings.getPiId());
        result.setTimestamp(compSettings.getTimestamp());

        result.setWaterFlowSensor(uc.entities.WaterFlowSensor.fromSwaggerObject(compSettings));
        result.setLightSensor(uc.entities.LightSensor.fromSwaggerObject(compSettings));
        result.setWaterLevelSensor(uc.entities.WaterLevelSensor.fromSwaggerObject(compSettings));
        result.setThermometer(uc.entities.Thermometer.fromSwaggerObject(compSettings));
        result.setLamp(uc.entities.Lamp.fromSwaggerObject(compSettings));
        result.setFeeder(uc.entities.Feeder.fromSwaggerObject(compSettings));
        result.setPump(uc.entities.Pump.fromSwaggerObject(compSettings));

        return result;
    }

    public io.swagger.model.ComponentSettings toSwaggerObject() {
        io.swagger.model.ComponentSettings result = new io.swagger.model.ComponentSettings();
        result.setPiId(getPiId());
        result.setTimestamp(getTimestamp());
        result.setWaterFlowSensor(getWaterFlowSensor().toSwaggerObject());
        result.setLightSensor(getLightSensor().toSwaggerObject());
        result.setWaterLevelSensor(getWaterLevelSensor().toSwaggerObject());
        result.setThermometer(getThermometer().toSwaggerObject());
        result.setLamp(getLamp().toSwaggerObject());
        result.setFeeder(getFeeder().toSwaggerObject());
        result.setPump(getPump().toSwaggerObject());

        return result;
    }
}
