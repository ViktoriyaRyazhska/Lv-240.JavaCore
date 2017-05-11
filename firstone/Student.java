package firstone;

/**
 * Created by yzavitc on 11.05.2017.
 */
public class Student {
    private String name;
    private double raiting;

    private static int count =0;
    private static double sumRaiting =0;
    private static double avgRaiting;

    public static double getAvgRaiting() {
        return sumRaiting/count;
    }

    public Student(String name, double raiting) {
        this.name = name;
        this.raiting = raiting;
        count++;
        sumRaiting = sumRaiting+raiting;
    }

    public Student(String name) {
        this.name = name;
        count++;
    }

    public Student() {count++;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRaiting() {
        return raiting;
    }

    public void setRaiting(double raiting) {
        sumRaiting=sumRaiting-this.raiting;
        this.raiting = raiting;
        sumRaiting=sumRaiting+raiting;
    }

    public boolean betterStudent(Student st){
        return this.getRaiting() > st.getRaiting();
    }


}
