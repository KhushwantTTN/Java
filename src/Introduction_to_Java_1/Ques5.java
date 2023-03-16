package Introduction_to_Java_1;

class Ques5 {
    String FirstName = "Khushwant",LastName = "Prajapati",Designation = "Trainee";
    int Age = 23;
    public Ques5(){


    }
    public Ques5(String FirstName,String LastName,String Designation,int Age){
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Designation = Designation;
        this.Age = Age;
    }


    public String getFirstName() {
        return FirstName;
    }


    public void setFirstName(String firstName) {
        FirstName = firstName;
    }


    public String getLastName() {
        return LastName;
    }


    public void setLastName(String lastName) {
        LastName = lastName;
    }


    public String getDesignation() {
        return Designation;
    }


    public void setDesignation(String designation) {
        Designation = designation;
    }


    public int getAge() {
        return Age;
    }


    public void setAge(int age) {
        Age = age;
    }




    @Override
    public String toString() {
        return  "FirstName = " + FirstName + '\n' +
                "LastName = " + LastName + '\n' +
                "Designation = " + Designation + '\n' +
                "Age = " + Age ;
    }


    public static void main(String[] args) {


        Ques5 obj = new Ques5();
        obj.setFirstName("Rahul");
        obj.setLastName("Kumar");
        obj.setDesignation("Trainee");
        obj.setAge(24);


        System.out.print(obj.toString());


    }
}
