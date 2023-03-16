package Java_8_Features_Part_1;

public class Ques1 {
    public static void main(String[] args) {
        Q1 a1 = (int a, int b) -> {
            boolean ans = false;
            if (a > b) {
                ans = true;
            } else {
                ans = false;
            }
            return ans;
        };
        System.out.println(a1.Greater(20,12));


        Q1_2 a2 = (int a) -> { return ++a;};
        System.out.println(a2.Incr(23));

        Q1_3 a3 = (String a,String b) -> { return a + b; };
        System.out.println(a3.Conc("Khushwant"," Prajapati"));

        Q1_4 a4 = (String a) -> { String b = a.toUpperCase(); return b; };
        System.out.println(a4.Conc("flahflkafalkfcalsk"));

    }
}
