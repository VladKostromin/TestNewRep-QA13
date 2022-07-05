import java.util.Random;

public class TestClass {

    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(6);
        if (a == 5) {
            System.out.println("we got 5!");
        } else {
            System.out.println("we got something else, but '5' D:");
        }
    }
}
