package uc.entities;

public class Fishes {

    private String piid;
    private String fishId;
    private String name;
    private int quantity;

    public Fishes() {
    }

    public String getPiId() { return piid; }
    public void setPiId(String piid) { this.piid = piid; }

    public String getFishId() {
        return fishId;
    }
    public void setFishId(String fishId) {
        this.fishId = fishId;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public static Fishes fromSwaggerObject(io.swagger.model.Fishes fishes) {
        Fishes result = new Fishes();
        result.setPiId(fishes.getPiid());
        result.setFishId(fishes.getFishid());
        result.setName(fishes.getName());
        result.setQuantity(fishes.getQuantity().intValue());
        return result;
    }

    public io.swagger.model.Fishes toSwaggerObject() {
        io.swagger.model.Fishes result = new io.swagger.model.Fishes();
        result.setPiid(getPiId());
        result.setFishid(getFishId());
        result.setName(getName());
        result.setQuantity(getQuantity());
        return result;
    }
}