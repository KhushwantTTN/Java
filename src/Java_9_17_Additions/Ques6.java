package Java_9_17_Additions;

import java.util.Optional;
import java.util.stream.Stream;

public class Ques6 {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("hello world");


        Stream<String> stream = optional.stream();


        stream.forEach(System.out::println);
    }
}
