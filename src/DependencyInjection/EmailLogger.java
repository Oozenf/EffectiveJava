package DependencyInjection;

public class EmailLogger implements Logger {
    @Override
    public void send(String msg) {
        System.out.println("Email logger : " + msg);
    }
}
