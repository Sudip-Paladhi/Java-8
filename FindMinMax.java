package Lambda;

import java.util.Arrays;
import java.util.List;

public class FindMinMax {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50, 60);
        int max = numbers.stream().max(Integer::compareTo).get();
        int min = numbers.stream().min(Integer::compareTo).get();

        System.out.println("Maximum number is: " + max);
        System.out.println("Minimum number is: " + min);
    }
}
