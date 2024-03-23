package com.upskillyourself.fundamentals;

import java.util.*;

public class Question2 {

    public static List<List<String>> findGroupAnagrams(String[] input){

        Map<String, List<String>> groupAnagrams = new HashMap<>();
        //Iterate the input list
        for(String element: input) {
            // Find the hashcode of each elements
            String hashCode = findHashCode(element);
            // Put it in the hashmap
            groupAnagrams.putIfAbsent(hashCode, new ArrayList<>());
            List<String> anagrams = groupAnagrams.get(hashCode);
            anagrams.add(element);
            groupAnagrams.put(hashCode, anagrams);
        }

        // Iterate the hashMap
        List<List<String>> groupAnagramsList = new ArrayList<>();
        for(List<String> anagrams: groupAnagrams.values()){
            // Put all the values which is a list into another list
            groupAnagramsList.add(anagrams);
        }
        return groupAnagramsList;
    }

    public static String findHashCode(String input){
        char[] inputArray = input.toCharArray();
        Arrays.sort(inputArray);
        return new String(inputArray);
    }

    public static void main(String args[]){
        String[] input = {"eat","tea","tan","ate","nat","bat","ac","bd","aac","bbd","aacc","bbdd","acc","bdd"};
        List<List<String>> output = findGroupAnagrams(input);
        for(List<String> groupAnagram: output){
            System.out.print("[");
            for(String anagram: groupAnagram){
                System.out.print(anagram + ",");
            }
            System.out.println("]");
        }
    }
}
