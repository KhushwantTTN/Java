package Java_9_17_Additions;

public interface MyInterface {
    default void publicMethod() {
        privateMethod();
        System.out.println("This is a public method.");
    }
    private void privateMethod() {
        System.out.println("This is a private method.");
    }
}

