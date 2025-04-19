import java.util.Scanner;
import java.util.ArrayList;
class TeamOlympiad{
      public static void main(String[] args){
             Scanner sc = new Scanner(System.in);
             int n = sc.nextInt();
             ArrayList<Integer> programmer = new ArrayList<>();
             ArrayList<Integer> math = new ArrayList<>();
             ArrayList<Integer> pe = new ArrayList<>();

             for(int i = 0;i < n;i++){
                int skill = sc.nextInt();
                if(skill == 1){
                    programmer.add(i+1);
                }else if(skill == 2){
                    math.add(i+1);
                }else if(skill == 3){
                    pe.add(i+1);
                }
             }
             int teamCount = Math.min(programmer.size(),Math.min(math.size(),pe.size()));

             System.out.println(teamCount);

             StringBuilder sb = new StringBuilder();
             for(int i = 0;i < teamCount;i++){
                 sb.append(programmer.get(i)).append(" ").append(math.get(i)).append(" ").append(pe.get(i)).append("\n");
             }
             System.out.println(sb.toString());

             sc.close();
      }
}