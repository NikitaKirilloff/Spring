package ru.otus.example.testconfigurationdemo.demo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ru.otus.example.testconfigurationdemo.family.FamilyMember;
import ru.otus.example.testconfigurationdemo.family.pets.Dog;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("В NestedConfigurationDemoTest семья должна ")
@SpringBootTest
public class NestedConfigurationDemoTest {

    @Autowired
    private Map<String, FamilyMember> family;

    @Configuration
    static class TestConf{
        @Bean
        public Dog dog() {
            return new Dog();
        }
    }

    @DisplayName(" содержать только собаку ")
    @Test
    void shouldContainOnlyDog() {
        assertThat(family).containsOnlyKeys("dog");
    }

}
