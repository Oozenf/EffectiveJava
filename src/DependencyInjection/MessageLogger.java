package DependencyInjection;

public class MessageLogger implements Logger {
    @Override
    public void send(String msg) {
        System.out.println("Message Logger : " + msg);
    }
}
