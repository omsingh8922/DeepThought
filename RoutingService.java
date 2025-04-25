package com.example.routing.service;
import com.example.routing.model.MoveRequest;
import com.example.routing.model.MoveResponse;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class RoutingService {

    public MoveResponse optimizeMoves(MoveRequest request) {
        long start = System.nanoTime();

        List<String> plan = new ArrayList<>();
        List<String> containers = request.getContainers();
        List<String> sources = request.getSources();
        List<String> destinations = request.getDestinations();

        if (containers.size() != sources.size() || containers.size() != destinations.size()) {
            throw new IllegalArgumentException("Input lists must be of equal size.");
        }

        for (int i = 0; i < containers.size(); i++) {
            plan.add("Move " + containers.get(i) + " from " + sources.get(i) + " to " + destinations.get(i));
        }

        long end = System.nanoTime();
        double latencyMs = (end - start) / 1_000_000.0;

        return new MoveResponse(plan, latencyMs);
    }
}
