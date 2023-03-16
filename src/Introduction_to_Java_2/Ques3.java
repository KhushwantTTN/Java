package Introduction_to_Java_2;

public class Ques3 {
    public static void main(String[] args) {
        try{
            Class.forName("ExceptionClass");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Helper help = new Helper();
    }
}

