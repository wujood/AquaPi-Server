package uc.entities;

public class Plants {

    private String piid;
    private String plantId;
    private String name;
    private int quantity;

    public Plants() {
    }

    public String getPiId() { return piid; }
    public void setPiId(String piid) { this.piid = piid; }

    public String getPlantId() {
        return plantId;
    }
    public void setPlantId(String plantId) {
        this.plantId = plantId;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public static Plants fromSwaggerObject(io.swagger.model.Plants plants) {
        Plants result = new Plants();
        result.setPiId(plants.getPiid());
        result.setPlantId(plants.getPlantid());
        result.setName(plants.getName());
        result.setQuantity(plants.getQuantity());
        return result;
    }

    public io.swagger.model.Plants toSwaggerObject() {
        io.swagger.model.Plants result = new io.swagger.model.Plants();
        result.setPiid(getPiId());
        result.setPlantid(getPlantId());
        result.setName(getName());
        result.setQuantity(getQuantity());
        return result;
    }
}