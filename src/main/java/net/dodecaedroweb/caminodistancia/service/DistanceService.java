package net.dodecaedroweb.caminodistancia.service;

import net.dodecaedroweb.caminodistancia.model.OdometerReport;
import net.dodecaedroweb.caminodistancia.util.DistanceCalculator;

import java.util.List;

public class DistanceService {

    public double calculateDistance(String date, String truckId) {
        // Obtener los reportes del odómetro del camión para la fecha especificada
        List<OdometerReport> reports = fetchOdometerReports(date, truckId);
        DistanceCalculator calculator = new DistanceCalculator();
        return calculator.calculateDistance(reports);
    }

    private List<OdometerReport> fetchOdometerReports(String date, String truckId) {
        // Implementar la lógica para obtener los reportes del odómetro
        return List.of();
    }
}
