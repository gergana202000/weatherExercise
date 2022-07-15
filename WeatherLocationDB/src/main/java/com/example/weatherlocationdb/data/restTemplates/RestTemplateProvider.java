package com.example.weatherlocationdb.data.restTemplates;

import com.example.weatherlocationdb.data.restTemplates.interfaces.IRestTemplateProvider;
import org.springframework.web.client.RestTemplate;

public class RestTemplateProvider implements IRestTemplateProvider {
    @Override
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
