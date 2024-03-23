package com.upskillyourself.fundamentals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Question3 {

    public static Set<List<Integer>> findCombinations(int[] input, int target) {

        Set<List<Integer>> output = new HashSet<>();
        Set<Integer> entry = new HashSet<>();

        for (Integer element : input) {
            entry.add(element);
        }

        // Iterate the given array to find possible combination
        for (Integer element : input) {
            // Create a list for saving the combination
            List<Integer> combination = new ArrayList<>();
            int sum = 0;

            while (sum < target) {
                sum += element;
                combination.add(element);
            }

            // if sum == target or sum > target
            if (sum == target) {
                output.add(combination);
            } else {
                while (sum > 0) {
                        sum -= element;
                        combination.remove(combination.size() - 1);

                        int currentTarget = target - sum;
                        if (entry.contains(currentTarget)) {
                            combination.add(currentTarget);
                            output.add(combination);
                            break;
                        }
                    }
            }
        }

        return output;
    }

        public static void main(String args[]){
            int[] input = {2, 3, 4, 7};
            int target = 7;
            Set<List<Integer>> output = findCombinations(input, target);
            for(List<Integer> combination : output){
                System.out.print("{");
                for(Integer element : combination){
                    System.out.print(element + ",");
                }
                System.out.println("}");
            }
        }
    }


