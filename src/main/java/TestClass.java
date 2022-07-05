import java.util.Random;

public class TestClass {

    public static void main(String[] args) {
        if (random(6) == 5) {
            System.out.println("we got 5!");
        } else {
            System.out.println("we got something else, but '5' D:");
        }

    }

    public static int random (int bound) {
        int result = 0;
        Random random = new Random();
        result = random.nextInt(bound);
        return result;
    }
}
