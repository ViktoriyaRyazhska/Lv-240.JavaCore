package secondone;

/**
 * Created by yzavitc on 11.05.2017.
 */
public class Main {

    public static void main(String[] args) {

        Employee e1 = new Employee();
        e1.setName("John");
        e1.setRate(5.0);
        e1.setHours(42);

        Employee e2 = new Employee("Tim",4.5);
        e2.setHours(48);

        Employee e3 = new Employee("Bob", 4.7, 44);

        System.out.println(Employee.getTotalSum());
    }
}
