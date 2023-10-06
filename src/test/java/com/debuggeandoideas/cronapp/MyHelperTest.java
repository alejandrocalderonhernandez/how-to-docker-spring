package com.debuggeandoideas.cronapp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MyHelperTest {

    @Test
    void timesShouldWorks() {
        Long expected = 2L;
        Long result = MyHelper.times();
        Assertions.assertEquals(expected, result);;
    }
}
