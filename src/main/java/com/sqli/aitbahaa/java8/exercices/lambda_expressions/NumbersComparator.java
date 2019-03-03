package com.sqli.aitbahaa.java8.exercices.lambda_expressions;


import java.util.function.Predicate;

public class NumbersComparator {

    public boolean isEven(Integer number) {
        Predicate<Integer> oddPredicate = num -> num % 2 == 0;

        return  oddPredicate.test(number);
    }


}
