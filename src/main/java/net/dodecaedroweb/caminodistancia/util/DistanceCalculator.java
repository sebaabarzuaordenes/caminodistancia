package net.dodecaedroweb.caminodistancia.util;

import net.dodecaedroweb.caminodistancia.model.OdometerReport;

import java.util.List;
import java.util.stream.Collectors;

public class DistanceCalculator {

    public double calculateDistance(List<OdometerReport> reports) {
        // Ordenar los reportes por fecha
        List<OdometerReport> sortedReports = reports.stream()
                .sorted((r1, r2) -> r1.getDate().compareTo(r2.getDate()))
                .collect(Collectors.toList());

        double distance = 0.0;
        for (int i = 1; i < sortedReports.size(); i++) {
            distance += sortedReports.get(i).getOdometerReading() - sortedReports.get(i - 1).getOdometerReading();
        }
        return distance;
    }
}
