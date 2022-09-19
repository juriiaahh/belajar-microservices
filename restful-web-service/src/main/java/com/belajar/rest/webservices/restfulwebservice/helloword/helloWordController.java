/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.belajar.rest.webservices.restfulwebservice.helloword;

import java.util.Locale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author JJuriah
 */
//Controller
@RestController
public class helloWordController {

    @Autowired
    private MessageSource messageSource;

    //GET
    //URI - /hello-word
    //METHOD - Hello World
//    @RequestMapping(method=RequestMethod.GET, path="/hello-world")
    @GetMapping(path = "/hello-world")
    public String helloWord() {
        return "Hello Word";
    }

    //helo-wordl-bean
    @GetMapping(path = "/hello-world-bean")
    public HelloWordBean helloWordBean() {
        return new HelloWordBean("Hello Word");
    }

    //helo-wordl-bean/path-variable/ijur
    @GetMapping(path = "/hello-world/path-variable/{name}")
    public HelloWordBean helloWordBeanPathVariable(@PathVariable String name) {
        return new HelloWordBean(String.format("hello world, %s", name));
    }

    @GetMapping(path = "/hello-world-internationalized")
    public String helloWordInternationalized(
//            @RequestHeader(name = "Accept-Language", required = false) Locale locale
    ) {
        return messageSource.getMessage("good.morning.messange", null, "Default Message",
//                locale);
                        LocaleContextHolder.getLocale());
//        return "Hello Word";
    }
}
