package com.example.routing.model;

import java.util.List;
import java.util.Map;

public class MoveRequest {
    private List<String> containers;
    private List<String> sources;
    private List<String> destinations;
    private Map<String, Object> constraints;
    public List<String> getContainers() 
      {
           return containers;
      }
    public void setContainers(List<String> containers)
       {
            this.containers = containers;
      }
    public List<String> getSources()
        {
            return sources;
        }
    public void setSources(List<String> sources)
      { 
         this.sources = sources;
     }

    public List<String> getDestinations()
       {
          return destinations;
       }
    public void setDestinations(List<String> destinations)
       {
           this.destinations = destinations;
       }

    public Map<String, Object> getConstraints() 
       {
          return constraints;
        }
    public void setConstraints(Map<String, Object> constraints) 
        {
          this.constraints = constraints; 
         }
}
