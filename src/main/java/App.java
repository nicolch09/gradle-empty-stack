
public class App {
    public static void main(String[] args) {
        Mobile android = new Android("J7", "black", "Samsung");
        Person person = new Person("Christoper");
        System.out.println(android.getPhoneInformation());
        System.out.println(person.makeACall(android, "Hello everyone!"));

        Mobile iPhone = new IPhone("iPhone 6S", "black", "Apple");
        Person person2 = new Person("Jack");
        System.out.println(iPhone.getPhoneInformation());
        System.out.println(person2.makeACall(android, "Goodbye!"));

        IPhoneRobot iPhoneRobot = new IPhoneRobot();
        IPhone iPhone2 = new IPhone("iPhone X", "black", "Apple");
        System.out.println(iPhoneRobot.makeACall(iPhone2, "IPhone Robot!"));
    }
}
