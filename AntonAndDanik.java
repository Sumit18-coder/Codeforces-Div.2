import java.util.Scanner;
class AntonAndDanik{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       String str1 = sc.nextLine();
       String str2 = sc.next();
       String result = "";
       for(int i = 0;i < str1.length(); i++){
         if(Integer.parseInt(str1.charAt(i) + "") == Integer.parseInt(str2.charAt(i) + "")){
                 result = result + "0";
             }else{
                 result = result + "1";
             }
       }
       System.out.println(result);
    }
}