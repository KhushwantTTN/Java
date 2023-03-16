package Java_9_17_Additions;

public class Main {
    public static void main(String[] args) {
        record student(String name,int age,int id){
            static int counter = 0;
            static void increase(){
                counter++;
            }
            student{
                increase();
            }

        }
        student s1 = new student("khushwant",23,1);
        student s2 = new student("hema",23,1);
        System.out.println(s1.equals(s2));
        System.out.println("counter = "+student.counter);
    }
}