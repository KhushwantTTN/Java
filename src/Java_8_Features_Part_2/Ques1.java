package Java_8_Features_Part_2;

public class Ques1 {
    public static void main(String[] args) {
        System.out.println("Consumer Interface");
        Consumer m1 = ((x) -> {
            System.out.println("No return type");
        });
        m1.show(24);
        System.out.println("Function Interface");
        Function m2 = ((j) -> {
            if (j != "") return 1;
            else return 8;
        });
        int ab = m2.print("");
        System.out.println(" " + ab);

        System.out.println("Supplier Interface ");
        Supplier m3 = (() -> {
            return 1;
        });
        int abc = m3.display();

        System.out.println(" " + abc);

        System.out.println("Predicate Interface");
        Predicate m4 = ((a, b) -> {
            if (a > b) return true;
            else return false;
        });
        boolean abcd = m4.number(24, 42);
        System.out.println(" " + abcd);
    }
}

