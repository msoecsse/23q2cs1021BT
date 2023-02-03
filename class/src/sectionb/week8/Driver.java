package sectionb.week8;

import sectionb.week7.Complex;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Driver {
    public static void main(String[] args) {
        List<Complex> nums = new ArrayList<>();
        for(int i=0; i<20; i++) {
            nums.add(new Complex(i, i%3));
        }
        nums.add(new Complex(-20, 0.0));
        List<Complex> realNums = getReal(nums);
        System.out.println(realNums);
    }

    private static List<Complex> getReal(List<Complex> nums) {
        return nums.stream()
                .filter(num -> num.getAngle()%180==0)
                .collect(Collectors.toList());
    }
}














