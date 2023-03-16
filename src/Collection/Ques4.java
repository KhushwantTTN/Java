package Collection;

import java.util.HashMap;

public class Ques4 {
    String name = "";
    int Age = 0;
    String Designation = "";


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return Age;
    }


    public void setAge(int age) {
        Age = age;
    }


    public String getDesignation() {
        return Designation;
    }


    public void setDesignation(String designation) {
        Designation = designation;
    }


    public Ques4(String name, int age, String designation) {
        this.name = name;
        Age = age;
        Designation = designation;
    }


    @Override
    public String toString() {
        return
                "name = " + name +"\n"+
                        "Age = " + Age +"\n"+
                        "Designation = " + Designation +"\n"+
                        "Salary ";
    }


    public static void main(String[] args) {


        HashMap<Ques4,Integer> map = new HashMap<>();
        map.put(new Ques4("Khushwant",23,"Trainee"),15000);


        System.out.println(map);
    }
}

