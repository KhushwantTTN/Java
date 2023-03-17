package Basics_of_Multi_Threading_Part_1;

public class Ques3 {
    private volatile int count = 0;
    public int getCount(){
        return count;
    }
    public void incrementCount(){
        System.out.println(count++);
    }
}
class singleT{
    public static void main(String[]args){
        Ques3 obj = new Ques3();
        Thread th1 = new Thread(()->{
            for (int i=0;i<5;i++){
                obj.incrementCount();
            }
        });
        Thread th2 = new Thread(()->{
            for (int i=0;i<5;i++){
                obj.incrementCount();
            }
        });
        System.out.println("First Thread");
        th1.start();
        try {
            th1.join();
        }catch (Exception e){

        }
        System.out.println("Second Thread");
        th2.start();
    }
}
