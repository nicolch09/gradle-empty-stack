public class Person {
    private String name;
    public Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String makeACall(Mobile mobile, String message){
        return mobile.checkMessage(message);
    }
}
