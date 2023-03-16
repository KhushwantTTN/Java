package Introduction_to_Java_3;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ques2 {
    private String firstname;
    private String lastname;
    private int age;
    private String phonenumber;
    public Ques2(String firstname, String lastname, int age, String phonenumber) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.phonenumber = phonenumber;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        try {
            FileWriter writer = new FileWriter("users.txt", true);
            while (!input.equals("QUIT")) {
                System.out.print("Enter firstname: ");
                String firstname = scanner.next();
                System.out.print("Enter lastname: ");
                String lastname = scanner.next();
                System.out.print("Enter age: ");
                int age = scanner.nextInt();
                System.out.print("Enter phone number: ");
                String phonenumber = scanner.next();
                Ques2 user = new Ques2(firstname, lastname, age, phonenumber);
                writer.write(user.firstname + "," + user.lastname + "," + user.age + "," + user.phonenumber + "\n");
                System.out.print("Do you want to continue creating users? (Type QUIT to exit) ");
                input = scanner.next();
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        scanner.close();
    }
}
