package ru.otus.example.testconfigurationdemo.demo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import ru.otus.example.testconfigurationdemo.family.FamilyMember;
import ru.otus.example.testconfigurationdemo.family.childrens.Son;
import ru.otus.example.testconfigurationdemo.family.parents.Mother;
import ru.otus.example.testconfigurationdemo.family.pets.Dog;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("В PlainSpringBootTestDemoTest семья должна ")
@SpringBootTest
public class PlainSpringBootTestDemoTest {

    @Autowired
    private Map<String, FamilyMember> family;


    @DisplayName(" содержать маму, сына и собаку ")
    @Test
    void shouldContainAllFamilyExceptFather() {
        assertThat(family).containsOnlyKeys("mother", "son", "dog");
    }

}
