package com;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class JenkinsEachCommitBuildApplicationTests {

    @Test
    void contextLoads() {

        assertEquals("salam", "salam");
    }

}
