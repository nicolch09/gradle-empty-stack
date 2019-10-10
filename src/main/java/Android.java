public class Android extends Mobile{
    private static final int MAX_MESSAGE = 30;
    public Android(String name, String color, String brand) {
        super(name, color, brand);
    }

    @Override
    public String call(String message){
        return "<Android> " + super.call(message);
    }

    @Override
    public String checkMessage(String message) {
        if (message.length() > MAX_MESSAGE)
            return "<Android> Message cannot be send";
        return call(message);
    }
}