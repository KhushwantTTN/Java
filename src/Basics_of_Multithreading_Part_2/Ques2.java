package Basics_of_Multithreading_Part_2;

public class Ques2 {
    public static void main(String[] args) throws InterruptedException {
        Ques2_1 b1=new Ques2_1(20);
        Thread th1=new Thread(b1);
        Ques2_1 b2=new Ques2_1(10);
        Thread th2=new Thread(b2);
        Ques2_1 b3=new Ques2_1(30);
        Thread th3=new Thread(b3);

        th1.start();
        // th1.join();
        th2.start();
        th3.start();

    }
}
