package uc.entities;

public class ParamFishes {

    private String piid;

    public ParamFishes() {
    }

    public String getPiId() { return piid; }
    public void setPiId(String piid) { this.piid = piid; }

    public static ParamFishes fromSwaggerObject(io.swagger.model.ParamFishes fishes) {
        ParamFishes result = new ParamFishes();
        result.setPiId(fishes.getPiid());
        return result;
    }

    public io.swagger.model.ParamFishes toSwaggerObject() {
        io.swagger.model.ParamFishes result = new io.swagger.model.ParamFishes();
        result.setPiid(getPiId());
        return result;
    }
}