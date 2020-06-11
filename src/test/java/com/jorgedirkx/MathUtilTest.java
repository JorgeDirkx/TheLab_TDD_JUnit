package com.jorgedirkx;

import com.jorgedirkx.MathUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MathUtilTest {

    MathUtil mathUtil = new MathUtil();

    @Test
    void test_Add(){
        Assertions.assertEquals(5, MathUtil.add(3,2));
    }
}
