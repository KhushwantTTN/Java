package Introduction_to_Java_3;

enum En {
    twoBHK(2000),
    threeBHK(3000),
    fourBHK(4000),
    fiveBHK(5000);
    private int price;
    En(int price){
        this.price=price;
    }
    public int getPrice() {
        return price;
    }
}
public class Ques1 {
    public static void main(String[] args) {
        System.out.println("All Flat Prices");
        for(En n : En.values()){
            System.out.println("House "+ n + "\n"+" Price " + n.getPrice());
        }
    }
}
