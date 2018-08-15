package com.filter.filterservice2.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/filter2")
public class Filter2Controller {

    @RequestMapping(value = "/test2", method = RequestMethod.GET)
    public ResponseEntity<?> filterTest2() {
        return new ResponseEntity<String>("Succefully executed FILTER SERVICE2", HttpStatus.OK);
    }

}