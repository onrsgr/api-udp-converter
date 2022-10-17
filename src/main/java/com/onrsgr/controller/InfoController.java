package com.onrsgr.controller;

import com.onrsgr.model.InfoModel;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {


    @PostMapping(value = "/postendpoint")
    public InfoModel getCmdForProcess(@RequestBody InfoModel infoModel){
        System.out.println(infoModel);
        return infoModel;
    }
}
