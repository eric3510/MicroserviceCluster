package microservice.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

/***
 * @author 王强 Email : 
 * @version 创建时间：2018/6/26
 * microservice.server.Application
 */
@EnableScheduling
@EnableEurekaServer
@SpringBootApplication
@ComponentScan(basePackages = {"org.springframework.boot.container.core","microservice.server"})
public class Application{
    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }
}
