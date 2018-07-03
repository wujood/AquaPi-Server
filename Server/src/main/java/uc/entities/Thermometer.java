package uc.entities;

public class Thermometer {

    private float value;

    public Thermometer() {
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

    public static Thermometer fromSwaggerObject(io.swagger.model.Thermometer swagThermometer)
    {
        Thermometer result = new Thermometer();
        // umrechnen in °C
        result.setValue(((swagThermometer.getValue() * 3.3f / 1024.0f) -0.5f)*100);
        result.setMessage(swagThermometer.getMessage());
        return result;
    }

    public io.swagger.model.Thermometer toSwaggerObject() {
        io.swagger.model.Thermometer result = new io.swagger.model.Thermometer();
        result.setValue(getValue());
        result.setMessage(getMessage());
        return result;
    }
}