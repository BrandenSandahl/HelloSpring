package com.theironyard;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by branden on 3/7/16 at 11:41.
 */
@RestController
public class HelloSpringJsonController {

    @RequestMapping(path = "/person.json", method = RequestMethod.GET)
    public Person jsonHome() {
        return new Person("Alice", "Charleston", 30);
    }





}