package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {
    
    public static void main(String[] args) {
        
        // Consumer<String> print = System.out::println;

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        /**
         * 1. Numero para string binaria... 6 => "110"
         * 2. Inverter a string... "110" => "011"
         * 3. Converter de volta para inteiro... "011 => 3
         */
        
        Function<Integer, String> integerToBinaryString = 
            num -> Integer.toBinaryString(num);

        UnaryOperator<String> reverseString = 
            value -> new StringBuilder(value).reverse().toString();

        Function<String, Integer> stringToInteger = 
            value -> Integer.parseInt(value, 2);

        nums.stream()
            .map(integerToBinaryString)
            .map(reverseString)
            .map(stringToInteger)
            .forEach(System.out::println);
    }
}