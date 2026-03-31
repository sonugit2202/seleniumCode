package ClassAndObj;

public class CallingCustomer {

    public static void main(String[] args) {
        Customer c1 = new Customer();
        c1.name = "Sonu";
        c1.email= "ABC@gmail.com";
        c1.phone = 987654320L;
        c1.isPrime = true;

        System.out.println(c1.isPrime);
        System.out.println(Customer.category);
        //Customer.category = "Sports";
        System.out.println(Customer.category);

    }
}

