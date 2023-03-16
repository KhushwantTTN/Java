package Introduction_to_Java_2;

import java.util.Scanner;

class Ex extends Exception
{
    public Ex(int age)
    {
        if(age < 18){
            System.out.print("Below 18 not allowed ");
        }else{
            System.out.print("Allowed ");
        }
    }
    @Override
    public synchronized Throwable fillInStackTrace() {
        return null;
    }
}

public class Ques4 {
    public static void EnterAge() throws Ex{
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Age");
        int age = input.nextInt();
        throw new Ex(age);
    }



    public static void main(String[] args) {
        try{
            EnterAge();
        } catch (Ex e) {
            e.printStackTrace();
        }


    }
}
