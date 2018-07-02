package uc.entities;

public class Lamp {

    private float value;

    public Lamp() {
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

    public static Lamp fromSwaggerObject(io.swagger.model.ComponentSettings compSettings)
    {
        Lamp result = new Lamp();
        result.setValue(compSettings.getLamp().getValue());
        result.setMessage(compSettings.getLamp().getMessage());
        return result;
    }

    public static Lamp fromSwaggerObject(io.swagger.model.Lamp swagLamp)
    {
        Lamp result = new Lamp();
        result.setValue(swagLamp.getValue());
        result.setMessage(swagLamp.getMessage());
        return result;
    }

    public io.swagger.model.Lamp toSwaggerObject() {
        io.swagger.model.Lamp result = new io.swagger.model.Lamp();
        result.setValue(getValue());
        result.setMessage(getMessage());
        return result;
    }
}