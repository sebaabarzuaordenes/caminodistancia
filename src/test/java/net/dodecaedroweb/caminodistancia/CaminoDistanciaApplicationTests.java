package net.dodecaedroweb.caminodistancia;

import net.dodecaedroweb.caminodistancia.model.OdometerReport;
import net.dodecaedroweb.caminodistancia.util.DistanceCalculator;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CaminoDistanciaApplicationTests {

    @Test
    public void testCalculateDistance() {
        List<OdometerReport> reports = List.of(
                new OdometerReport("2024-08-01T08:00:00", 100.0),
                new OdometerReport("2024-08-01T12:00:00", 150.0),
                new OdometerReport("2024-08-01T16:00:00", 200.0)
        );

        DistanceCalculator calculator = new DistanceCalculator();
        double distance = calculator.calculateDistance(reports);

        assertEquals(100.0, distance);
    }

}
