package com.upskillyourself.fundamentals;

import java.util.HashMap;
import java.util.Map;

public class Question1 {

    public static int findSimilarPair(int[] arr1, int[] arr2) {

        //Create a hashMap with occurrence of elements in arr2
        Map<Integer, Integer> entry = new HashMap<>();
        for (Integer element : arr2) {
            entry.putIfAbsent(element, 0);
            entry.put(element, entry.get(element) + 1);
        }

        //Iterate the arr1 to find the pairs
        int pairCount = 0;
        for (Integer element : arr1) {
            if (entry.containsKey(element)) pairCount += entry.get(element);
        }

        return pairCount;
    }

    public static void main(String args[]) {
        int[] arr1 = {1, 1, 3, 3, 3, 5, 8, 8};
        int[] arr2 = {1, 3, 3, 4, 5, 5, 5};
        System.out.println(findSimilarPair(arr1, arr2));
    }

}
