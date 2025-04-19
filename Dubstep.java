import java.util.Scanner;
class Dubstep{
     public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          String str = sc.nextLine();
          String result = str.replace("WUB"," ").replaceAll("\\s+"," ").trim();
          System.out.println(result);

     }
}