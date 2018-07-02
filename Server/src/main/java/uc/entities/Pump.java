package uc.entities;

public class Pump {

    private float value;

    public Pump() {
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

    public static Pump fromSwaggerObject(io.swagger.model.ComponentSettings compSettings)
    {
        Pump result = new Pump();
        result.setValue(compSettings.getPump().getValue());
        result.setMessage(compSettings.getPump().getMessage());
        return result;
    }

    public static Pump fromSwaggerObject(io.swagger.model.Pump swagPump)
    {
        Pump result = new Pump();
        result.setValue(swagPump.getValue());
        result.setMessage(swagPump.getMessage());
        return result;
    }

    public io.swagger.model.Pump toSwaggerObject() {
        io.swagger.model.Pump result = new io.swagger.model.Pump();
        result.setValue(getValue());
        result.setMessage(getMessage());
        return result;
    }
}