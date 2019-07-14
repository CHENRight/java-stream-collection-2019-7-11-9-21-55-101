package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        //throw new NotImplementedException();
        int left = leftBorder < rightBorder ? leftBorder : rightBorder;
        int right = leftBorder < rightBorder ? rightBorder : leftBorder;
        List<Integer> numbers = IntStream.rangeClosed(left,right).boxed().collect(Collectors.toList());
        return numbers.stream().filter(i -> i % 2 == 0).collect(Collectors.toList()).stream().mapToInt(i -> i).sum();
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        throw new NotImplementedException();
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
//        throw new NotImplementedException();
        List<Integer> resultNumber = arrayList.stream().map(i -> i * 3 + 2 ).distinct().collect(Collectors.toList());
        return resultNumber.stream().mapToInt(i -> i).sum();
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        //throw new NotImplementedException();
        return arrayList.stream().map(num -> (num % 2 == 0 ? num : num * 3 + 2)).collect(Collectors.toList());
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

//    public double getMedianOfEven(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }

    public double getAverageOfEven(List<Integer> arrayList) {
//        throw new NotImplementedException();
        List<Integer> numbers = arrayList.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> x).summaryStatistics();
        stats.getAverage();
        return arrayList.stream().filter(item -> item % 2 == 0).mapToInt(i -> i).average().orElse(0);
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        throw new NotImplementedException();
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        //throw new NotImplementedException();
        return arrayList.stream().filter(i -> i % 2 == 0).distinct().collect(Collectors.toList());
    }

//    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }

//    public List<Integer> getProcessedList(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }
}
