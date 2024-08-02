package net.dodecaedroweb.caminodistancia.controller;

import net.dodecaedroweb.caminodistancia.model.DistanceResponse;
import net.dodecaedroweb.caminodistancia.service.DistanceService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DistanceController {

    private final DistanceService distanceService;

    private DistanceController(DistanceService distanceService) {
        this.distanceService = distanceService;
    }


    @GetMapping("/api/distance")
    public DistanceResponse getDistance(@RequestParam String date, @RequestParam(required = false) String truckId) {
        double distance = distanceService.calculateDistance(date, truckId);
        return new DistanceResponse(truckId, date, distance);
    }
}
