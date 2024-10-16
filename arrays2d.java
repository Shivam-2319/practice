import java.util.*;

public class arrays2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int array2d[][] = new int[rows][cols];
        for (int i = 0;i<rows;i++){
            for (int j=0;j<cols;j++){
                array2d[i][j] = sc.nextInt();

            }
        }
        int query = sc.nextInt();
        for (int i = 0;i<rows;i++){
            for (int j=0;j<cols;j++){
                if (array2d[i][j] == query){
                    System.out.print("query found at index " +i+ " row and " + j +" column");
                }
            }
        }
        
    }
    
}
