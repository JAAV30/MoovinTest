package com.moovin.test;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import com.moovin.controller.LocationController;

public class App extends Application{
	
	private Set<Object> singletons = new HashSet<Object>();
    public App() {
        singletons.add(new LocationController());
    }
    @Override
    public Set<Object> getSingletons() {
        return singletons;
    }

}
