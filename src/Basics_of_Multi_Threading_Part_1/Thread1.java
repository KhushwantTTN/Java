package Basics_of_Multi_Threading_Part_1;

public class Thread1 implements Runnable{
    private Object lock1;
    private Object lock2;
    public Thread1(Object lock1, Object lock2){
        this.lock1=lock1;
        this.lock2=lock2;
    }
    public void run(){
        synchronized (lock1){
            System.out.println(Thread.currentThread().getName()+" lock resource 1");
            try{
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
            synchronized (lock2){
                System.out.println(Thread.currentThread().getName()+" lock resource 2");
            }
        }
    }
}
