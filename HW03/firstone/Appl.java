package firstone;

/**
 * Created by yzavitc on 11.05.2017.
 */
public class Appl {
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.setName("Olya");
        st1.setRaiting(4);

        Student st2 = new Student("Igor");
        st2.setRaiting(5);

        Student st3 = new Student("Vasya", 3);

        boolean b = st1.betterStudent(st2);
        System.out.println(b);

        System.out.println(st2.betterStudent(st3));

        //System.out.println(st1);

        System.out.println(Student.getAvgRaiting());
    }

}
