package com.moovin.test.service;

import com.moovin.test.dto.LocationDTO;
import com.vividsolutions.jts.algorithm.locate.SimplePointInAreaLocator;
import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.GeometryFactory;
import com.vividsolutions.jts.geom.Polygon;
import org.springframework.stereotype.Service;

@Service
public class JtsService {

    private static final Coordinate[] COORDINATES = {
            new Coordinate(10.02933,-84.125963),
            new Coordinate(10.040148,-84.055239),
            new Coordinate(10.001268,-84.008203),
            new Coordinate(9.979967,-83.988977),
            new Coordinate(9.946152,-83.978334),
            new Coordinate(9.921804,-83.991381),
            new Coordinate(9.913011,-83.949152),
            new Coordinate(9.883586,-83.893534),
            new Coordinate(9.837246,-83.846155),
            new Coordinate(9.814919,-83.854738),
            new Coordinate(9.821008,-83.950182),
            new Coordinate(9.839952,-83.986231),
            new Coordinate(9.853821,-83.986231),
            new Coordinate(9.887645,-83.953958),
            new Coordinate(9.897453,-83.971468),
            new Coordinate(9.878513,-84.074121),
            new Coordinate(9.894748,-84.142786),
            new Coordinate(9.894748,-84.161325),
            new Coordinate(9.900788,-84.161218),
            new Coordinate(9.906434,-84.205075),
            new Coordinate(9.902188,-84.217974),
            new Coordinate(9.904218,-84.260202),
            new Coordinate(9.931611,-84.263979),
            new Coordinate(9.929244,-84.293505),
            new Coordinate(9.95021,-84.341227),
            new Coordinate(9.986053,-84.340197),
            new Coordinate(10.007692,-84.332),
            new Coordinate(10.045895,-84.22999),
            new Coordinate(10.057389,-84.160982),
            new Coordinate(10.02933,-84.125963)
    };

    private GeometryFactory gf;
    private Polygon polygon;

    public LocationDTO checkLocation(double latitude, double longitude){

        gf = new GeometryFactory();
        polygon = gf.createPolygon(COORDINATES);

        LocationDTO locationDTO = new LocationDTO();
        locationDTO.setAvailable(SimplePointInAreaLocator.containsPointInPolygon(new Coordinate(latitude, longitude), polygon));
        locationDTO.setLatitude(latitude);
        locationDTO.setLongitude(longitude);

        return locationDTO;
    }
}
