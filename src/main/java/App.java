
public class App {
    public static void main(String[] args) {
        IPhone android = new IPhone("J7", "black", "Samsung");
        Person person = new Person("Christoper");

       person.makeACall(android, "hello");
    }
}
