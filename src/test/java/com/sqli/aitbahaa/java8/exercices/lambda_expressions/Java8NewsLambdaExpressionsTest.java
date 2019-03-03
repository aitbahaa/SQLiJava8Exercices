package com.sqli.aitbahaa.java8.exercices.lambda_expressions;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Java8NewsLambdaExpressionsTest {

    private static final Integer EVEN_NUMBER = 4;

    @Test
    public void checkIsAnEvenNumber(){
        NumbersComparator comparator = new NumbersComparator();
        assertTrue(EVEN_NUMBER + " is an even number", comparator.isEven(EVEN_NUMBER));
    }




}
