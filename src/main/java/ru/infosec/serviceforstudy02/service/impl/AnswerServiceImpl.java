package ru.infosec.serviceforstudy02.service.impl;


import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestTemplate;
import ru.infosec.serviceforstudy02.service.AnswerService;

import java.net.URI;

@Service
public class AnswerServiceImpl implements AnswerService {
    @Value("${target.app.host}")
    private String host;
    @Value("${target.app.port}")
    private String port;
    @Value("${target.app.url}")
    private String url;

    @Override
    @SneakyThrows
    public String getAnswerFromService(){
        final String uri = "http://" + host + ":" + port + "/" + url ;
        System.out.println(uri);
        RestTemplate restTemplate = new RestTemplate();
        String result;
        result = restTemplate.getForObject(URI.create(uri), String.class);
        return result;
    }
}
