public class Android extends Mobile{
    public Android(String name, String color, String brand) {
        super(name, color, brand);
    }

    @Override
    public String call(String message){
        return "<Android> " + super.call(message);
    }
}