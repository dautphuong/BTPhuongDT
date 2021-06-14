package entities;

public class FixedWing {
    String idFixed;
    String model;
    String planeType;
    double cruiseSpeed;
    double emptyWeight;
    double maxTakeoffWeight;
    double minRunway;
    final String flyMethod="fixed wing";

    public FixedWing() {
        super();
    }

    public String getIdFixed() {
        return idFixed;
    }

    public void setIdFixed(String idFixed) {
        this.idFixed = idFixed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPlaneType() {
        return planeType;
    }

    public void setPlaneType(String planeType) {
        this.planeType = planeType;
    }

    public double getCruiseSpeed() {
        return cruiseSpeed;
    }

    public void setCruiseSpeed(double cruiseSpeed) {
        this.cruiseSpeed = cruiseSpeed;
    }

    public double getEmptyWeight() {
        return emptyWeight;
    }

    public void setEmptyWeight(double emptyWeight) {
        this.emptyWeight = emptyWeight;
    }

    public double getMaxTakeoffWeight() {
        return maxTakeoffWeight;
    }

    public void setMaxTakeoffWeight(double maxTakeoffWeight) {
        this.maxTakeoffWeight = maxTakeoffWeight;
    }

    public double getMinRunway() {
        return minRunway;
    }

    public void setMinRunway(double minRunway) {
        this.minRunway = minRunway;
    }

    public String getFlyMethod() {
        return flyMethod;
    }
}
