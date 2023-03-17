package Java_9_17_Additions;

import java.util.stream.IntStream;

public class Ques3 {
    public static void main(String[] args) {
        IntStream stream = IntStream.range(1,10);
        stream.forEach(System.out::println);
    }
}
