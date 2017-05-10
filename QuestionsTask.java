import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Intel i5 on 07.05.2017.
 */
public class QuestionsTask {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("How are you?");
        String answer = br.readLine();
        System.out.println("So you are " + answer);

    }
}
