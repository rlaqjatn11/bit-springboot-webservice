package com.example.web.springboot.web.dto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void main(String[] args) { SpringBootApplication.run(Application.class, args); }
    // 스프링 부트 안에 있는 wAS web aplication server 를 사용해 톰캣의 설치가 필요없음
}
