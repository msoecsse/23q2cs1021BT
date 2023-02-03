package sectionc.week8;

import sectionc.week7.Complex;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Driver {
    public static void main(String[] args) {
        List<Complex> nums = new ArrayList<>();
        for(int i=0; i<100; i++) {
            nums.add(new Complex(i, i%17));
        }
        List<Complex> reals = getReal(nums);
    }

    public static List<Complex> getReal(List<Complex> stuff) {
        return stuff.stream()
                .filter(c -> c.getAngle()%180==0)
                .collect(Collectors.toList());
    }





    public static void main2(String[] args) {
        List<Integer> nums = new ArrayList<>();
        for(int i=-10; i<600; i++) {
            nums.add(i);
        }
        List<Integer> even = getEven(nums);
        List<Integer> odds = getOdd(nums);
        List<Integer> divisibleByThree = getThirds(nums);
        even = getOfInterest(nums, i -> i%2==0);
        odds = getOfInterest(nums, i -> i%2!=0);
        divisibleByThree = getOfInterest(nums, i -> i%3==0);
        even = nums.stream()
                .filter(i -> i%2==0)
                .collect(Collectors.toList());
    }

    private static List<Integer> getOfInterest(List<Integer> nums, Predicate<Integer> isInteresting) {
        List<Integer> result = new ArrayList<>();
        for(Integer num : nums) {
            if(isInteresting.test(num)) {
                result.add(num);
            }
        }
        return result;
    }


    private static List<Integer> getThirds(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();
        for(Integer num : nums) {
            if(num%3==0) {
                result.add(num);
            }
        }
        return result;
    }

    private static List<Integer> getOdd(List<Integer> nums) {
        List<Integer> odds = new ArrayList<>();
        for(Integer num : nums) {
            if(num%2!=0) {
                odds.add(num);
            }
        }
        return odds;
    }

    private static List<Integer> getEven(List<Integer> nums) {
        List<Integer> evens = new ArrayList<>();
        for(Integer num : nums) {
            if(num%2==0) {
                evens.add(num);
            }
        }
        return evens;
    }
}








