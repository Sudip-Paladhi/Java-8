package Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertToUppercase {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("sudip", "sandip", "sattwik");
        List<String> result = names.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(result);
    }
}