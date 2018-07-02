package uc.entities;

public class Feeder {

    private float value;

    public Feeder() {
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

    public static Feeder fromSwaggerObject(io.swagger.model.ComponentSettings compSettings)
    {
        Feeder feeder = new Feeder();
        feeder.setValue(compSettings.getFeeder().getValue());
        feeder.setMessage(compSettings.getFeeder().getMessage());
        return feeder;
    }

    public static Feeder fromSwaggerObject(io.swagger.model.Feeder swagFeeder)
    {
        Feeder feeder = new Feeder();
        feeder.setValue(swagFeeder.getValue());
        feeder.setMessage(swagFeeder.getMessage());
        return feeder;
    }

    public io.swagger.model.Feeder toSwaggerObject() {
        io.swagger.model.Feeder result = new io.swagger.model.Feeder();
        result.setValue(getValue());
        result.setMessage(getMessage());
        return result;
    }
}