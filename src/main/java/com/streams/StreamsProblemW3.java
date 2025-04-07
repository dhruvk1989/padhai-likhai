package com.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsProblemW3 {

    public void exerciseOne(){

        //Write a Java program to calculate the average of a list of integers using streams.
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6);

        double v = integers.stream().mapToInt(Integer::intValue).average().orElse(0);

        System.out.println(v);

    }

    public void exerciseTwo(){

        //Write a Java program to convert a list of strings to uppercase or lowercase using streams.

        List<String> strings = List.of("heLLO", "wORld", "OK", "THree", "TWO", "One");

        strings.stream().map(a -> a.toUpperCase()).forEach(System.out::print);
        System.out.println();
        strings.stream().map(a -> a.toLowerCase()).forEach(System.out::print);

    }

    public void exerciseThree(){

        //Write a Java program to calculate the sum of all even, odd numbers in a list using streams.

        List<Integer> integerList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int evenSum = integerList.stream().filter(a -> a % 2 == 0).mapToInt(Integer::intValue).sum();
        int oddSum = integerList.stream().filter(a -> a % 2 == 1).mapToInt(Integer::intValue).sum();

        System.out.println(evenSum);
        System.out.println(oddSum);

    }

    public void exerciseFour(){

        //Write a Java program to remove all duplicate elements from a list using streams
        List<Integer> intStream = List.of(1, 2, 3, 1, 2, 3, 1, 2, 3);

        Stream<Integer> distinct = intStream.stream().distinct();
        distinct.forEach(System.out::println);

    }

    public void exerciseFive(String a){

        //Write a Java program to count the number of strings in a list that start with a specific letter using streams.

        List<String> wordList = List.of("Five", "Four", "Three", "Two");

        System.out.println(wordList.stream().filter(b -> b.startsWith(a)).count());

    }

    public void exerciseSix(){

        //Write a Java program to sort a list of strings in alphabetical order, ascending and descending using streams
        List<String> wordList = List.of("Five", "Four", "Three", "Two");

        Stream<String> sortedAsc = wordList.stream().sorted();
        Stream<String> sortedDesc = wordList.stream().sorted(Comparator.reverseOrder());

        System.out.println(sortedAsc.collect(Collectors.toList()));
        System.out.println(sortedDesc.collect(Collectors.toList()));


    }

    public void exerciseSeven(){

        //Write a Java program to find the maximum and minimum values in a list of integers using streams.
        List<Integer> integerList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println(integerList.stream().max(Comparator.naturalOrder()).orElse(-1));
        System.out.println(integerList.stream().max((a,b) -> Integer.compare(a, b)).orElse(-1));
        System.out.println(integerList.stream().min(Comparator.naturalOrder()).orElse(-1));

    }

    public static void main(String[] args) {
        StreamsProblemW3 sW3 = new StreamsProblemW3();
        //sW3.exerciseOne();
        //sW3.exerciseTwo();
        //sW3.exerciseThree();
        //sW3.exerciseFour();
        //sW3.exerciseFive("F");
        //sW3.exerciseSix();
        sW3.exerciseSeven();
    }

}
