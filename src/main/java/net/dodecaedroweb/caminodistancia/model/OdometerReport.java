package net.dodecaedroweb.caminodistancia.model;

public class OdometerReport {
    private String date;
    private double odometerReading;

    public OdometerReport(String date, double odometerReading) {
        this.date = date;
        this.odometerReading = odometerReading;
    }

    public String getDate() {
        return date;
    }

    public double getOdometerReading() {
        return odometerReading;
    }
}
