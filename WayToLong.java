import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine(); 
     for (int i = 0; i < t; i++) {
            
            String word = scanner.nextLine();
      
            if (word.length() > 10) {
                String shortenedWord = word.charAt(0) + Integer.toString(word.length() - 2) + word.charAt(word.length() - 1);
                System.out.println(shortenedWord);
            } else {
                System.out.println(word);
            }
        }
        
        scanner.close();
    }
}
