package uc.entities;

public class ParamPlants {

    private String piid;

    public ParamPlants() {
    }

    public String getPiId() { return piid; }
    public void setPiId(String piid) { this.piid = piid; }

    public static ParamPlants fromSwaggerObject(io.swagger.model.ParamPlants plants) {
        ParamPlants result = new ParamPlants();
        result.setPiId(plants.getPiid());
        return result;
    }

    public io.swagger.model.ParamPlants toSwaggerObject() {
        io.swagger.model.ParamPlants result = new io.swagger.model.ParamPlants();
        result.setPiid(getPiId());
        return result;
    }
}