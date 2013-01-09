package com.voghan.sample.rest.view;

public class ResourceDetails {
    private String description;
    private String start_time;
    private String end_time;
    
    public ResourceDetails(String description, 
                           String start_time,
                           String end_time)
    {
       super();
       this.description = description;
       this.start_time = start_time;
       this.end_time = end_time;
    }

    public String getDescription() {
        return description;
    }

    public String getStart_time() {
        return start_time;
    }

    public String getEnd_time() {
        return end_time;
    }
    
    
}
