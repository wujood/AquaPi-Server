package uc.entities;

public class ParamConfigurations {

    private String piid;

    public ParamConfigurations() {
    }

    public String getPiId() { return piid; }
    public void setPiId(String piid) { this.piid = piid; }

    public static ParamConfigurations fromSwaggerObject(io.swagger.model.ParamPushConfiguration configurations) {
        ParamConfigurations result = new ParamConfigurations();
        result.setPiId(configurations.getPiid());
        return result;
    }

    public io.swagger.model.ParamPushConfiguration toSwaggerObject() {
        io.swagger.model.ParamPushConfiguration result = new io.swagger.model.ParamPushConfiguration();
        result.setPiid(getPiId());
        return result;
    }
}