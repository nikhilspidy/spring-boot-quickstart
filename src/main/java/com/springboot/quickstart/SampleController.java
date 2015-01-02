package com.springboot.quickstart;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class SampleController {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }


    @RequestMapping("/test")
    @ResponseBody
    String getTest() {
        return "Hello World! This is a test code....";
    }

    @RequestMapping(value="/test", method=RequestMethod.POST)
    @ResponseBody
    String postTest() {
        return "Hello World! POST call is successful....";
    }
	
}