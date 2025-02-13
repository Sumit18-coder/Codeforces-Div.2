import java.util.Scanner;
class StringTask1{
   public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     String input = sc.nextLine().toLowerCase();
     String vowels = "aoyeui";
     StringBuilder result = new StringBuilder();
     for(char c : input.toCharArray()){
        if(vowels.indexOf(c) == -1){
           result.append(".").append(c);
        }
     }
     System.out.println(result.toString());
     sc.close();
 }
}