package com.springtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by isologub on 7/31/2017.
 */
@RestController
public class GreetingController {

    @Autowired
    private JedisTestService jedisTestService;

    @RequestMapping("/greeting")
    public String greeting(){
        return jedisTestService.get("name");
    }

    @RequestMapping("/example/get/{id}")
    public String get(@PathVariable String id){
        return id;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/example/post")
    public String post(@RequestBody Greeting greeting){
        return greeting.getContent();
    }
}
