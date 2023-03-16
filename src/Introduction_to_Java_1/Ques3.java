package Introduction_to_Java_1;

import java.util.*;
public class Ques3 {
    static double pi = 3.14;
    public static void main(String[] args){
        int option;
        double radius,circuference;
        Scanner input = new Scanner(System.in);
        System.out.print("*******Menu*******"+"\n"+
                "1. Calculate Area of Circle"+"\n"+

                "2. Calculate Circumference of a Circle"+"\n"+
                "3. Exit."+"\n"+
                "Choose an option (1-3): ");
        option = input.nextInt();
        switch (option)
        {
            case 1: System.out.print("Enter Radius: ");
                radius = input.nextDouble();
                System.out.print("Area of Circle :"+pi*(radius*radius));
                break;
            case 2: System.out.print("Enter Radius: ");
                radius = input.nextDouble();
                circuference = Math.round(2*pi*radius);
                System.out.print(circuference);
                break;
            case 3: System.out.print("Exited");
                break;
            default: System.out.print("Invalid Choice");
        }
    }
}

