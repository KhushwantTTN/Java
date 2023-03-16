package Java_8_Features_Part_1;

interface Animal {
    default void move() {
        System.out.println("This animal can move");
    }
}


interface Mammal {
    default void eat() {
        System.out.println("This mammal can eat");
    }
}


class Ques3_Dog implements Animal, Mammal {
    public static void main(String args[]) {
        Ques3_Dog dog = new Ques3_Dog();
        dog.move();
        dog.eat();
    }
}
