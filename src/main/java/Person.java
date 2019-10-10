public class Person {
    private String name;
    public Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void makeACall(Mobile mobile, String message){
        System.out.print(mobile.call(message));
    }
}
