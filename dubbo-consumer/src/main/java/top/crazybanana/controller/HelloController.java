package top.crazybanana.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import top.crazybanana.service.IHelloService;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Reference
    IHelloService service;

    @RequestMapping
    public String hello(@RequestParam String name){
        return service.sayHello(name);
    }
}
