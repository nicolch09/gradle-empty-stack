public class IPhone extends Mobile{
    private static final int MAX_MESSAGE = 20;
    public IPhone(String name, String color, String brand) {
        super(name, color, brand);
    }

    @Override
    public String call(String message){
        return "<iPhone> " + super.call(message);
    }

    @Override
    public String checkMessage(String message) {
        if (message.length() > MAX_MESSAGE)
            return "<iPhone> Message cannot be send";
        return call(message);
    }
}