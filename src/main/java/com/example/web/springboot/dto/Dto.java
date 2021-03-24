package com.example.web.springboot.dto;

//import jdk.nashorn.internal.objects.annotations.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

public class Dto {


    @Getter
    @RequiredArgsConstructor
    public static class HelloResponseDto {

        private final String name;
        private final int amount;
    }

}
