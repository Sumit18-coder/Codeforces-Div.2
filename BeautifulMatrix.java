import java.util.Queue;

class BeautifulMatrix {
    int[][] dir = {{-1, 0}, {1, 0}, {0, 1}, {0, -1}};
    
    public int processMatrix(int[][] matrix) {
        boolean[][] visited = new boolean[matrix.length][matrix[0].length];
        int R = matrix.length;
        int C = matrix[0].length;
        
        Queue<int[]> queue = new java.util.LinkedList<int[]>();

        int start_i = R % 2 != 0 ? R / 2 : R / 2 - 1;
        int start_j = C % 2 != 0 ? C / 2 : C / 2 - 1;
        int level = 0;
        queue.add(new int[] {start_i, start_j});
        boolean found_one = false;

        while (!queue.isEmpty() && !found_one) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] point = queue.poll();

                if (matrix[point[0]][point[1]] == 1) {
                    System.out.println("found one");
                    found_one = true;
                    break;
                }
                for (int[] d : dir) {
                    int x = point[0] + d[0];
                    int y = point[1] + d[1];
                    if (canTraverse(matrix, x, y, visited)) {
                        visited[x][y] = true;
                        queue.offer(new int[] {x, y});
                    }
                }
            }
            if (found_one) {
                break;
            }
            level++;
        }
        return level;
    }
    
    private boolean canTraverse(int[][] matrix, int x, int y, boolean[][] visited) {
        if (x < 0 || x >= matrix.length || y < 0 || y >= matrix[0].length || visited[x][y]) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {       
        int[][] matrix = {
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 1},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0}
        };
        BeautifulMatrix bm = new BeautifulMatrix();
        int res = bm.processMatrix(matrix);
        System.out.println("Minimum no. of levels/steps required to make Matrix beautiful Is: " + res); 
    }
}
