package Java_9_17_Additions;

import java.util.Optional;

public class Car {
    private String make;
    private String model;
    private Optional<Integer> year;

    public Car(String make, String model, Integer year) {
        this.make = make;
        this.model = model;
        this.year = Optional.ofNullable(year);
    }

    public String getDescription(){
        if (year.isPresent()){
            return year.get() + " " + make + " " + model;
        }else{
            return make + " " + model;
        }
    }

    public static void main(String[] args) {
        Car car1 = new Car("Ford","endeavour",2007);
        Car car2 = new Car("TATA","Fortuner",2017);

        System.out.println(car1.getDescription());
        System.out.println(car2.getDescription());
    }
}
