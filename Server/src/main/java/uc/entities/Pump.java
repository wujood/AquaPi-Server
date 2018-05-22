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

    public static Pump fromSwaggerObject(io.swagger.model.ComponentSettings compSettings)
    {
        Pump result = new Pump();
        result.setValue(compSettings.getPump().getValue());
        return result;
    }

    public static Pump fromSwaggerObject(io.swagger.model.Pump swagPump)
    {
        Pump result = new Pump();
        result.setValue(swagPump.getValue());
        return result;
    }

    public io.swagger.model.Pump toSwaggerObject() {
        io.swagger.model.Pump result = new io.swagger.model.Pump();
        result.setValue(getValue());
        return result;
    }
}