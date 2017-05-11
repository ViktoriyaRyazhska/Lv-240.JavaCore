package secondone;

/**
 * Created by yzavitc on 11.05.2017.
 */
public class Employee {

    private String name;
    private double rate;
    private double hours;

    private static double totalSum; // сума зарплат

    public Employee() {}

    public Employee(String name, double rate) {
        this.name = name;
        this.rate = rate;

    }

    public Employee(String name, double rate, double hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum = totalSum+hours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        totalSum=totalSum-this.hours;
        this.hours = hours;
        totalSum=totalSum+hours;
    }

    public static double getTotalSum() {
        return totalSum;
    }

    public double salary(){
        double s = rate*hours;
        return s;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }

    public double changeRate(int rate){
        this.rate = rate;
        return rate;
   }

    public double bonuses(){
        return salary()*0.1;
    }
}
