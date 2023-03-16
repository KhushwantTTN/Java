package Java_8_Features_Part_1;

@FunctionalInterface
interface MyInter {
    Message send(String message);
}


class Message {


    public Message(String message) {
        System.out.println(message);
    }
}


class Ques4 {


    public static void main(String[] args) {
        MyInter myInterface = Message::new;
        myInterface.send("Hello!");
    }
}

