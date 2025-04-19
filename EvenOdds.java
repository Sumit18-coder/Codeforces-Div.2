import java.util.Scanner;
import java.util.Scanner;
public class EvenOdds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();

        long result;
        if (k <= (n + 1) / 2) {
            
            result = 2 * k - 1;
        } else {
           
            result = 2 * (k - (n + 1) / 2);
        }

        System.out.println(result);
    }
}
