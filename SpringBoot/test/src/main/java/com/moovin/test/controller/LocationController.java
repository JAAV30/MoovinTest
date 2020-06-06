package com.moovin.test.controller;

import com.moovin.test.dto.LocationDTO;
import com.moovin.test.service.JtsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/location")
public class LocationController {

    @Autowired
    private JtsService jtsService;

    @PostMapping(path = "/availableLocation")
    @ResponseBody
    public LocationDTO availableLocation(@RequestParam("latitude") String latitude,
                                         @RequestParam("longitude") String longitude){
        return jtsService.checkLocation(Double.parseDouble(latitude), Double.parseDouble(longitude));
    }
}
