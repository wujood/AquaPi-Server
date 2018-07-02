package uc.entities;

import java.util.Date;
public class Configurations {
    private String piId;
    private float minAirTemperature;
    private float maxAirTemperature;
    private float minWaterTemperature;
    private float maxWaterTemperature;
    private float brightnessTreshhold;
    private float feederFrequency;
    private float waterFlowSensitivity;
    private int togglePushNotifications;

    public String getPiId() {
        return piId;
    }

    public void setPiId(String piId) {
        this.piId = piId;
    }

    public float getMinAirTemperature() {
        return minAirTemperature;
    }

    public void setMinAirTemperature(float minAirTemperature) {
        this.minAirTemperature = minAirTemperature;
    }

    public float getMaxAirTemperature() {
        return maxAirTemperature;
    }

    public void setMaxAirTemperature(float maxAirTemperature) {
        this.maxAirTemperature = maxAirTemperature;
    }

    public float getMinWaterTemperature() {
        return minWaterTemperature;
    }

    public void setMinWaterTemperature(float minWaterTemperature) {
        this.minWaterTemperature = minWaterTemperature;
    }

    public float getMaxWaterTemperature() {
        return maxWaterTemperature;
    }

    public void setMaxWaterTemperature(float maxWaterTemperature) {
        this.maxWaterTemperature = maxWaterTemperature;
    }

    public float getBrightnessTreshhold() {
        return brightnessTreshhold;
    }

    public void setBrightnessTreshhold(float brightnessTreshhold) {
        this.brightnessTreshhold = brightnessTreshhold;
    }

    public float getFeederFrequency() {
        return feederFrequency;
    }

    public void setFeederFrequency(float feederFrequency) {
        this.feederFrequency = feederFrequency;
    }

    public float getWaterFlowSensitivity() {
        return waterFlowSensitivity;
    }

    public void setWaterFlowSensitivity(float waterFlowSensitivity) {
        this.waterFlowSensitivity = waterFlowSensitivity;
    }

    public int getTogglePushNotifications() {
        return togglePushNotifications;
    }

    public void setTogglePushNotifications(int togglePushNotifications) {
        this.togglePushNotifications = togglePushNotifications;
    }

    public Configurations() {
    }

    public static Configurations fromSwaggerObject(io.swagger.model.PushConfiguration configurations)
    {
        Configurations result = new Configurations();
        result.setPiId(configurations.getPiid());

        result.setMinAirTemperature(configurations.getMinairtemperature());
        result.setMaxAirTemperature(configurations.getMaxairtemperature());
        result.setMinWaterTemperature(configurations.getMinwatertemperature());
        result.setMaxWaterTemperature(configurations.getMaxwatertemperature());
        result.setBrightnessTreshhold(configurations.getBrightnesstreshhold());
        result.setFeederFrequency(configurations.getFeederfrequency());
        result.setWaterFlowSensitivity(configurations.getWaterflowsensitivity());
        result.setTogglePushNotifications(configurations.getTogglepushnotifications());

        return result;
    }

    public io.swagger.model.PushConfiguration toSwaggerObject() {
        io.swagger.model.PushConfiguration result = new io.swagger.model.PushConfiguration();
        result.setPiid(getPiId());

        result.setMinairtemperature(getMinAirTemperature());
        result.setMaxairtemperature(getMaxAirTemperature());
        result.setMinwatertemperature(getMinWaterTemperature());
        result.setMaxwatertemperature(getMaxWaterTemperature());
        result.setBrightnesstreshhold(getBrightnessTreshhold());
        result.setFeederfrequency(getFeederFrequency());
        result.setWaterflowsensitivity(getWaterFlowSensitivity());
        result.setTogglepushnotifications(getTogglePushNotifications());

        return result;
    }
}
