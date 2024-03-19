package ru.infosec.serviceforstudy02.controller;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.infosec.serviceforstudy02.service.AnswerService;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class AnswerController {
    private final AnswerService answerService;

    @GetMapping("/${app.url}")
    @SneakyThrows
    public String getAnswerFromService(){
        return answerService.getAnswerFromService();
    }
}
