package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ques1 {
    public static void main(String[] args) {
        List<Float> numbers = new ArrayList<Float>();
        numbers.add(2.5F);
        numbers.add(4.8f);
        numbers.add(1.2f);
        numbers.add(3.6f);
        numbers.add(5.9f);


        Iterator<Float> iterator = numbers.iterator();
        float sum = 0.0f;
        while(iterator.hasNext()) {
            sum += iterator.next();
        }
        System.out.println("Sum of the numbers in List: " + sum);
    }
}

