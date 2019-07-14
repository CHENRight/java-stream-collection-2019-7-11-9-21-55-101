package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        //throw new NotImplementedException();
        int start = left > right ? right : left;
        int end = left > right ? left : right;
        List<Integer> numbers = IntStream.rangeClosed(start,end).boxed().collect(Collectors.toList());
        if(left < right){
            return numbers;
        }else {
            return numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        }
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        //throw new NotImplementedException();
        int start = left > right ? right : left;
        int end = left > right ? left : right;
        List<Integer> numbers = IntStream.rangeClosed(start,end).boxed().collect(Collectors.toList());
        List<Integer> EvenNumbers = numbers.stream().filter(item -> item % 2 == 0).collect(Collectors.toList());
        if(left < right){
            return EvenNumbers;
        }else {
            return EvenNumbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        }
    }

    public List<Integer> popEvenElments(int[] array) {
        //throw new NotImplementedException();
        List<Integer> numbers = new ArrayList<Integer>();
        Arrays.stream(array).filter(item -> item % 2 == 0).forEach(i -> numbers.add(i));
        return numbers;
    }

    public int popLastElment(int[] array) {
        //throw new NotImplementedException();
        //return array[array.length - 1];
        return Arrays.stream(array).skip(array.length - 1).boxed().collect(Collectors.toList()).get(0);
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        throw new NotImplementedException();
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        throw new NotImplementedException();
    }
}
