package DependencyInjection;

public class Test {

    public static void main(String[] args) {
        CustomerService cs = new CustomerService(new MessageLogger());
        cs.postOneCustomer();
    }

}
