package kr.co.jongminkim.demo_springboot_docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoSpringbootDockerApplication {

    @GetMapping()
    public String getHello(){
        return "Hello JongminKim";
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoSpringbootDockerApplication.class, args);
    }
}
