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

    public static Feeder fromSwaggerObject(io.swagger.model.ComponentSettings compSettings)
    {
        Feeder feeder = new Feeder();
        feeder.setValue(compSettings.getFeeder().getValue());
        return feeder;
    }

    public static Feeder fromSwaggerObject(io.swagger.model.Feeder swagFeeder)
    {
        Feeder feeder = new Feeder();
        feeder.setValue(swagFeeder.getValue());
        return feeder;
    }

    public io.swagger.model.Feeder toSwaggerObject() {
        io.swagger.model.Feeder result = new io.swagger.model.Feeder();
        result.setValue(getValue());
        return result;
    }
}