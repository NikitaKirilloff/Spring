package ru.otus.example.testconfigurationdemo.demo2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import ru.otus.example.testconfigurationdemo.family.FamilyMember;
import ru.otus.example.testconfigurationdemo.family.childrens.Son;
import ru.otus.example.testconfigurationdemo.family.parents.Father;
import ru.otus.example.testconfigurationdemo.family.parents.Mother;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("В SpringBootTestWithExternalLimitationDemoTest семья должна ")
@SpringBootTest
public class SpringBootTestWithExternalLimitationDemoTest {

    /*@TestConfiguration
    static class SpringBootTestWithExternalLimitationDemo {
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
    }*/

    @Autowired
    private Map<String, FamilyMember> family;

    @DisplayName(" содержать маму, папу и сына")
    @Test
    void shouldContainAllFamilyExceptFather() {
        assertThat(family).containsOnlyKeys("mother", "father", "son");
    }

}
