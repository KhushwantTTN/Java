package Introduction_to_Java_1;

public class Ques1 {
    static String FirstName,LastName;
    static int Age;
    static {
        FirstName = "Khushwant";
        LastName = "Prajapati";
        Age = 23;
    }
    static void show(){
        System.out.print("FirstName "+FirstName+"\n"+"LastName "+LastName+"\n"+"Age "+Age);
    }
    public static void main(String[] args) {
        Ques1.show();
    }
}

