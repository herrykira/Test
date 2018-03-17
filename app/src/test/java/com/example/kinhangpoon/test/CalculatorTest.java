package com.example.kinhangpoon.test;

import junit.framework.TestCase;

/**
 * Created by KinhangPoon on 5/2/2018.
 */
// write test case
public class CalculatorTest extends TestCase{
    MaxNum maxNum;
    Calculator calculator;
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        calculator = new Calculator();
        maxNum = new MaxNum();

    }
    public void testAddTwoNums(){
        int expectedResult = 30;
        int acutualResult = calculator.addTwoNum(10,20);
        assertEquals(expectedResult,acutualResult);
    }
    public void testFindMax(){
        assertEquals(4,MaxNum.findMax(new int[]{1,3,4,2}));
        assertEquals(-1,MaxNum.findMax(new int[]{-12,-1,-3,-4,-2}));
    }
    public void testCube(){
        int expectedResult = 27;
        int acutualResult = calculator.cube(3);
        assertEquals(expectedResult,acutualResult);
    }
    public void testReverse(){
        String expectedResult ="abcde";
        String actualResult = calculator.reverse("edcba");
        assertEquals(expectedResult,actualResult);
    }
}
