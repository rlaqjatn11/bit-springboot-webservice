package com.example.web.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing // JPA Audtiting 활성화 기능
@SpringBootApplication
public class Application {
    public static void main(String[] args)
    { SpringApplication.run(Application.class, args); }  // 스프링 부트 안에 있는 wAS web aplication server 를 사용해 톰캣의 설치가 필요없음




}
