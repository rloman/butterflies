package nl.workingspirit.butterflies.rest;


import nl.workingspirit.butterflies.model.Groep;
import nl.workingspirit.butterflies.services.GroepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

@RestController
@RequestMapping("api/groeps")
public class GroepController {

    @Autowired
    private GroepService service;

    @GetMapping
    public Iterable<Groep> getGroepen() {

        return this.service.findAll();

    }

    
}
