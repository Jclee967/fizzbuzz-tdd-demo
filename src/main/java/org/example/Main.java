package org.example;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        IntStream.rangeClosed(1,20).forEach(
                x-> System.out.println(new FizzBuzzConvertor().convert(x))
        );


    }
}