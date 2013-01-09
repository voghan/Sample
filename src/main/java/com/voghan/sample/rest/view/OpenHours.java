package com.voghan.sample.rest.view;

import java.util.List;

public class OpenHours {
    private List<Resource> resources;

    public OpenHours(List< Resource > resources)
    {
       super();
       this.resources = resources;
    }

    public List<Resource> getResources() {
        return resources;
    }
}



