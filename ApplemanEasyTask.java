import java.util.Scanner;
public class ApplemanEasyTask{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       sc.nextLine();

       char[][] grid = new char[n][n];
       System.out.println("Input for grid : ");
       for(int i = 0;i < n;i++){
           grid[i] = sc.nextLine().toCharArray();
       }
       boolean isEasyTask = true;
       for(int i = 0;i < n;i++){
          for(int j = 0;j < n;j++){
             int neighbors = 0;
             if(i > 0 && grid[i - 1][j] == 'O') neighbors++;
             if(i < n - 1 && grid[i + 1][j] == 'O') neighbors++;
             if(j > 0 && grid[i][j - 1] == 'O') neighbors++;
             if(j < n - 1 && grid[i][j + 1] == 'O') neighbors++;

             if(neighbors % 2 != 0){
                isEasyTask = false;
                break;
             }
             if(!isEasyTask) break;
          }
       } 
       if(isEasyTask){
          System.out.println("YES");
       }else{
          System.out.println("NO");
       }
       sc.close();
    }
}