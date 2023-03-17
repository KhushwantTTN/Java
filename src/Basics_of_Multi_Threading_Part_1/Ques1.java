package Basics_of_Multi_Threading_Part_1;
public class Ques1 extends Thread {
    public void run(){
        for (int i=0; i<5;i++){
            try {
                Thread.sleep(1000);
            }
            catch (Exception e){

            }
            System.out.println(i);
        }
    }
}
class Main{
    public static void main(String[]args){
        Ques1 obj = new Ques1();
        Ques1 obj1 = new Ques1();
        System.out.println("By Using Thread Class");
        System.out.println("Thread 2 start ");
        obj1.start();
        try {
            obj1.join();
        }
        catch (Exception e){

        }
        System.out.println("Thread 1 start");
        obj.start();
    }
}
