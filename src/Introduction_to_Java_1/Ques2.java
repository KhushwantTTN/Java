package Introduction_to_Java_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args){
        List<String> arr = new ArrayList<>();
        System.out.println("Enter the value and type XDONE to end"+"\n");
        Scanner input = new Scanner(System.in);
        while (true){
            String line = input.nextLine();
            if("XDONE".equalsIgnoreCase(line)){
                break;
            }
            arr.add(line);
        }
        System.out.print(arr);
    }
}
