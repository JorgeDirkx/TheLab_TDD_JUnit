package com.jorgedirkx;

import com.jorgedirkx.MathUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MathUtilTest {

    MathUtil mathUtil = new MathUtil();

    @Test
    void test_Add(){
        Assertions.assertEquals(5, MathUtil.add(3,2));
    }

    @Test
    void test_Mult(){
        Assertions.assertEquals(6, MathUtil.multiple(3,2));
    }

    @Test
    void test_Even(){
        MathUtil.isEven(5);
    }

    @Test
    void testIs_Prime(){
        assertTrue(MathUtil.isPrime(13));
    }
}
