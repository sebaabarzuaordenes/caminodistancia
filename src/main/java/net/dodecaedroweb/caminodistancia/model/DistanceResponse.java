package net.dodecaedroweb.caminodistancia.model;

public class DistanceResponse {
    private String truckId;
    private String date;
    private double distance;

    public DistanceResponse(String truckId, String date, double distance) {
        this.truckId = truckId;
        this.date = date;
        this.distance = distance;
    }

    // Getters and setters
    public String getTruckId() {
        return truckId;
    }

    public void setTruckId(String truckId) {
        this.truckId = truckId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
}
