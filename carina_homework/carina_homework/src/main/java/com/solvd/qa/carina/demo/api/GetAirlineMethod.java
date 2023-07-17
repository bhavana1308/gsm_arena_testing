package com.solvd.qa.carina.demo.api;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.config.Configuration;


@Endpoint(url = "${base_url}/airlines/1", methodType = HttpMethodType.GET)
@ResponseTemplatePath(path = "api/airlines/_getAirlines/rs.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class GetAirlineMethod extends AbstractApiMethodV2 {

    public GetAirlineMethod() {
        replaceUrlPlaceholder("base_url", Configuration.getRequired("airline_api_url"));
    }
}