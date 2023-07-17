package com.solvd.qa.carina.demo.api;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.RequestTemplatePath;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.config.Configuration;



@Endpoint(url = "${base_url}/passenger/5ef4a412aab3841847750ce8", methodType = HttpMethodType.DELETE)
@RequestTemplatePath(path = "api/airlines/_deletePassenger/rq.json")
@ResponseTemplatePath(path = "api/airlines/_deletePassenger/rs.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class DeletePassengerMethod extends AbstractApiMethodV2 {

    public DeletePassengerMethod() {
        replaceUrlPlaceholder("base_url", Configuration.getRequired("airline_api_url"));
    }
}

