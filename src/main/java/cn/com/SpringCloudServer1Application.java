package cn.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudServer1Application {
	//123实现微服务高可用注册中心三个注册中心123 顶端对其专用
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudServer1Application.class, args);
	}

}
