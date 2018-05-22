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

    public static Lamp fromSwaggerObject(io.swagger.model.ComponentSettings compSettings)
    {
        Lamp result = new Lamp();
        result.setValue(compSettings.getLamp().getValue());
        return result;
    }

    public static Lamp fromSwaggerObject(io.swagger.model.Lamp swagLamp)
    {
        Lamp result = new Lamp();
        result.setValue(swagLamp.getValue());
        return result;
    }

    public io.swagger.model.Lamp toSwaggerObject() {
        io.swagger.model.Lamp result = new io.swagger.model.Lamp();
        result.setValue(getValue());
        return result;
    }
}