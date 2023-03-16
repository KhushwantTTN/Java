package Introduction_to_Java_3;

import java.util.Scanner;

interface Cur{
    String getSymbol();
}
public class Ques4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Country: ");
        String country = sc.nextLine();
        Cur c = CurrentCountry.current(country);
        System.out.println("Currency of "+country+" is : "+c.getSymbol());


    }
}
class Rupee implements Cur{
    @Override
    public String getSymbol() {
        return "Rs";
    }
}
class Pounds implements Cur{
    @Override
    public String getSymbol() {
        return "Pounds";
    }
}
class USDollar implements Cur{
    @Override
    public String getSymbol() {
        return "USD";
    }
}
class CurrentCountry{
    public static Cur current(String country){
        if(country.equalsIgnoreCase("India")){
            return new Rupee();
        }else if (country.equalsIgnoreCase("UK")){
            return new Pounds();
        }else if (country.equalsIgnoreCase("US")){
            return new USDollar();
        }
        throw new IllegalArgumentException("No such currency");
    }
}

