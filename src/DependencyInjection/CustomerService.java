package DependencyInjection;

public class CustomerService  {

    private final Logger logger;

    public CustomerService(Logger logger) {
        this.logger = logger;
    }

    public void postOneCustomer(){
        logger.send("Customer has been added.");
    }
}
