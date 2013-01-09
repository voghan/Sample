package com.voghan.sample.rest.view;

import java.util.List;

public class Resource {

    private String resource;
    private List< ResourceDetails > resource_details;
    
    public Resource(String resource, List< ResourceDetails > resource_details)
    {
       super();
       this.resource = resource;
       this.resource_details = resource_details;
    }

    public String getResource() {
        return resource;
    }

    public List<ResourceDetails> getResource_details() {
        return resource_details;
    }
    
    
}
