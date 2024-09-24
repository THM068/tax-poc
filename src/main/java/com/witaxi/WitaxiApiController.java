package com.witaxi;

import io.micronaut.http.annotation.*;

@Controller("/witaxi-api")
public class WitaxiApiController {

    @Get(uri = "/", produces = "text/plain")
    public String index() {
        return "Example Response";
    }
}