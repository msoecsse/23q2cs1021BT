package sectiona.week8;

import sectiona.week7.Complex;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Driver {
    public static void main(String[] args) {
        List<Complex> nums = new ArrayList<>();
        for(int i=0; i<20; i++) {
            nums.add(new Complex(i, i%3));
        }
        List<Complex> realNums = getReal(nums);
        System.out.println(realNums);
        OptionalDouble averageAngle = nums.stream()
                .mapToDouble(c -> c.getMagnitude())
                .average();
        if(averageAngle.isPresent()) {
            System.out.println(averageAngle.getAsDouble());
        }
    }

    public static List<Double> mapToDouble(List<Complex> nums) {
        List<Double> result = new ArrayList<>();
        for(Complex num : nums) {
            result.add(num.getMagnitude());
        }
        return result;
    }

    public static List<Complex> getReal(List<Complex> list) {
        return list.stream()
                .filter(num -> num.getAngle()%180==0)
                .collect(Collectors.toList());
    }
}











