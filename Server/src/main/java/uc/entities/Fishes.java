package uc.entities;

public class Fishes {

    private String piid;
    private String fishId;
    private String name;
    private int quantity;
    private int minTemp;
    private int maxTemp;
    private int frostFood;
    private int flakeFood;
    private int liveFood;
    private int needsHiding;
    private int minQuantity;
    private int weight;
    private String helpLink;
    private String picLink;

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

    public int getMinTemp() { return minTemp; }
    public void setMinTemp(int minTemp) { this.minTemp = minTemp; }

    public int getMaxTemp() { return maxTemp; }
    public void setMaxTemp(int maxTemp) { this.maxTemp = maxTemp; }

    public int getFrostFood() { return frostFood; }
    public void setFrostFood(int frostFood) { this.frostFood = frostFood; }

    public int getFlakeFood() { return flakeFood; }
    public void setFlakeFood(int flakeFood) { this.flakeFood = flakeFood; }

    public int getLiveFood() { return liveFood; }
    public void setLiveFood(int liveFood) { this.liveFood = liveFood; }

    public int getNeedsHiding() { return needsHiding; }
    public void setNeedsHiding(int needsHiding) { this.needsHiding = needsHiding; }

    public int getMinQuantity() { return minQuantity; }
    public void setMinQuantity(int minQuantity) { this.minQuantity = minQuantity; }

    public int getWeight() { return weight; }
    public void setWeight(int weight) { this.weight = weight; }

    public String getHelpLink() { return helpLink; }
    public void setHelpLink(String helpLink) { this.helpLink = helpLink; }

    public String getPicLink() { return picLink; }
    public void setPicLink(String picLink) { this.picLink = picLink; }

    public static Fishes fromSwaggerObject(io.swagger.model.Fishes fishes) {
        Fishes result = new Fishes();
        result.setPiId(fishes.getPiid());
        result.setFishId(fishes.getFishid());
        result.setName(fishes.getName());
        result.setQuantity(fishes.getQuantity().intValue());
        result.setMinTemp(fishes.getMintemp());
        result.setMaxTemp(fishes.getMaxtemp());
        result.setFrostFood(fishes.getFrostfood());
        result.setFlakeFood(fishes.getFlakefood());
        result.setLiveFood(fishes.getLivefood());
        result.setNeedsHiding(fishes.getNeedshiding());
        result.setMinQuantity(fishes.getMinquantity());
        result.setWeight(fishes.getWeight());
        result.setHelpLink(fishes.getHelplink());
        result.setPicLink(fishes.getPiclink());

        return result;
    }

    public io.swagger.model.Fishes toSwaggerObject() {
        io.swagger.model.Fishes result = new io.swagger.model.Fishes();
        result.setPiid(getPiId());
        result.setFishid(getFishId());
        result.setName(getName());
        result.setQuantity(getQuantity());
        result.setMintemp(getMinTemp());
        result.setMaxtemp(getMaxTemp());
        result.setFrostfood(getFrostFood());
        result.setFlakefood(getFlakeFood());
        result.setLivefood(getLiveFood());
        result.setNeedshiding(getNeedsHiding());
        result.setMinquantity(getMinQuantity());
        result.setWeight(getWeight());
        result.setHelplink(getHelpLink());
        result.setPiclink(getPicLink());

        return result;
    }
}