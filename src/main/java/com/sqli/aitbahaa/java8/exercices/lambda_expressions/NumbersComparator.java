package com.sqli.aitbahaa.java8.exercices.lambda_expressions;


import java.util.function.Predicate;

public class NumbersComparator {

    private static boolean test(Integer number) {
        return number % 2 == 0;
    }

    public boolean isEven(Integer number) {

        Predicate<Integer> oddPredicate = NumbersComparator::test;

        return  oddPredicate.test(number);
    }


}
