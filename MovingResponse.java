package com.example.routing.model;

import java.util.List;

public class MovingResponse {
    private List<String> plan;
    private double latencyMs;

    public MoveResponse(List<String> plan, double latencyMs) 
  {
        this.plan = plan;
        this.latencyMs = latencyMs;
    }

    public List<String> getPlan()
     { 
          return plan;
      }
    public double getLatencyMs()
     { 
       return latencyMs;
     }
}
