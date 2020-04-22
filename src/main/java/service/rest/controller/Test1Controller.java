package service.rest.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/test1")
public class Test1Controller {

    @RequestMapping(value="/check.do", method = RequestMethod.GET)
    public String check(){

        return "{'Result':'Ok!'}";
    }


    @GetMapping(value="/")
    public String root(){

        return "{'Result':'Hello Test1 Service!'}";
    }



}
