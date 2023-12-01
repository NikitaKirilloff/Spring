package ru.otus.example.testconfigurationdemo.demo2;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import ru.otus.example.testconfigurationdemo.family.FamilyMember;
import ru.otus.example.testconfigurationdemo.family.childrens.Son;
import ru.otus.example.testconfigurationdemo.family.parents.Father;
import ru.otus.example.testconfigurationdemo.family.parents.Mother;

@SpringBootConfiguration
public class TestSpringBootConfiguration {
    @Bean
    public FamilyMember father() {
        return new Father();
    }
    @Bean
    public FamilyMember mother() {
        return new Mother();
    }
    @Bean
    public FamilyMember son() {
        return new Son();
    }
}
