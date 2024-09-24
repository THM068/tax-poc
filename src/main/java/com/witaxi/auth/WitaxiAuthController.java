package com.witaxi.auth;

import com.witaxi.api.RegisterCustomerApi;
import com.witaxi.model.RegisterCustomerRequest;
import com.witaxi.model.RegisterCustomerResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Status;
import io.micronaut.scheduling.annotation.ExecuteOn;

import static io.micronaut.http.HttpStatus.*;
import static io.micronaut.scheduling.TaskExecutors.BLOCKING;
@Controller
public class WitaxiAuthController implements RegisterCustomerApi {

    @ExecuteOn(BLOCKING)
    @Status(CREATED)
    @Override
    public RegisterCustomerResponse registerCustomer(RegisterCustomerRequest registerCustomerRequest) {
        RegisterCustomerResponse response = new com.witaxi.model.RegisterCustomerResponse();
        response.registrationId("123");
        return response;
    }
}
