import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Intel i5 on 07.05.2017.
 */
public class VariablesTask {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Type a value for variable a");
        long a = Long.parseLong(br.readLine());
        System.out.println("Type a value for variable b");
        long b = Long.parseLong(br.readLine());

        System.out.println("a+b= " + (a+b));
        System.out.println("a-b= " + (a-b));
        System.out.println("a*b= " + (a*b));
        System.out.println("a/b= " + (a/b));
        System.out.println("a%b= " + (a%b));

    }
}
