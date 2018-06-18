package top.crazybanana.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Service
@Component
public class HelloServiceImpl implements IHelloService {

    public String sayHello(String name){
        return "Hello " + name;
    }
}
