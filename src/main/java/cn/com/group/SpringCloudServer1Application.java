package cn.com.group;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudServer1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudServer1Application.class, args);
	}

}
