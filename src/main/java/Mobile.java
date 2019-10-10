public abstract class Mobile{
    private String name;
    private String color;
    private String brand;
    public abstract String checkMessage(String message);

    public Mobile(String name, String color, String brand){
        this.name = name;
        this.color = color;
        this.brand = brand;
    }

    public String call(String message){
        return "Message : " + message;
    }

    public String getPhoneInformation(){
        return "name: " + getName() + ", color: " + getColor() + ", brand: " + getBrand();
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }
}