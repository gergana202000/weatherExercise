package com.example.weatherlocationdb.data.restTemplates.interfaces;

import org.springframework.web.client.RestTemplate;

public interface IRestTemplateProvider {
    RestTemplate getRestTemplate();
}
