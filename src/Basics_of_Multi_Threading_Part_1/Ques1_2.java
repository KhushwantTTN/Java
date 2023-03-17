package Basics_of_Multi_Threading_Part_1;

public class Ques1_2 implements Runnable {
    public void run(){
        for (int i=0; i<5;i++){
            try {
                Thread.sleep(1050);
            }
            catch (Exception e){

            }
            System.out.println(i);
        }
    }
}
class Single_Thread{
    public static void main(String[]args){
        Ques1_2 obj = new Ques1_2();
        Ques1_2 obj2 = new Ques1_2();
        Thread t = new Thread(obj);
        Thread t2 = new Thread(obj2);
        System.out.println("By Using Runnable Interface");
        System.out.println("Thread 1 Start");
        t.start();
        try {
            t.join();
        }
        catch (Exception e){

        }
        System.out.println("Thread 2 Start");
        t2.start();

    }
}
