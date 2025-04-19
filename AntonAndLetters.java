import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class AntonAndLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        input = input.replace("{", "").replace("}", "").replaceAll("\\s+", "");

        Set<Character> distinctLetters = new HashSet<>();
        for (int i = 0; i < input.length(); i++) {
            char letter = input.charAt(i);
            if (letter != ',') {
                distinctLetters.add(letter);
            }
        }
        System.out.println(distinctLetters.size());
    }
}
