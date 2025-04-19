import java.util.Scanner;
class FoxAndSnake{
      public static void main(String[] args){
           Scanner sc = new Scanner(System.in);
           int n = sc.nextInt();
           int m = sc.nextInt();

           String a = "";
           String b = "";

           for(int i = 0; i < m-1; i++){
              a += "#";
              b += ".";
           }
           a += "#";
           boolean flag = true;
           for(int i = 0;i < n; i++){
              if(i % 2 == 0) System.out.println(a);
              else{
                  if(flag){
                      System.out.println(b + "#");
                      flag = !flag;
                  }else{
                      System.out.println("#" + b);
                      flag = !flag;
                  }
              }
           }
      }
}