package Java_9_17_Additions;

public interface Ques1 {
    default void publicMethod(){
        privateMethod();
        System.out.println("This is public method");
    }
    private void privateMethod(){
        System.out.println("This is a private method");
    }
}
