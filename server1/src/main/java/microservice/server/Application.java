package microservice.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.container.core.service.impl.BaseServiceImpl;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

/***
 * @author 王强 Email : 
 * @version 创建时间：2018/6/28
 * microservice.server.Application
 */
@EnableScheduling
@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan(basePackages = {"org.springframework.boot.container.core","microservice.server"})
public class Application extends BaseServiceImpl{
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
