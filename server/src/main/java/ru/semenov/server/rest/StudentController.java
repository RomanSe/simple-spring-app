package ru.semenov.server.rest;

import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    @Lazy
    EurekaClient eurekaClient;


}
