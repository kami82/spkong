package service.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test2")
public class Test2Controller {

    @RequestMapping(value="/check.do", method = RequestMethod.GET)
    public String check(){

        return "{'Result':'Ok!'}";
    }


    @GetMapping(value="/")
    public String root(){

        return "{'Result':'Hello Test2 Service!'}";
    }



}
