import java.util.Scanner;
public class Cakeminator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        sc.nextLine(); 
        
        char[][] grid = new char[rows][cols];
        for (int i = 0; i < rows; i++) {
            grid[i] = sc.nextLine().toCharArray();
        }
       
        boolean[] rowHasStrawberry = new boolean[rows];
        boolean[] colHasStrawberry = new boolean[cols];
       
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 'S') {
                    rowHasStrawberry[i] = true;
                    colHasStrawberry[j] = true;
                }
            }
        }

        int maxCakeCells = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (!rowHasStrawberry[i] || !colHasStrawberry[j]) {
                    maxCakeCells++;
                }
            }
        }
        System.out.println(maxCakeCells);
        sc.close();
    }
}
