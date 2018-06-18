package top.crazybanana;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.CountDownLatch;

@SpringBootApplication
@EnableDubbo
public class Provider {
    public static void main(String[] args) throws InterruptedException {

        SpringApplication.run(Provider.class, args);

        new CountDownLatch(1).await();
    }
}
