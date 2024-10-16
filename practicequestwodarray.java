import java.util.*;

public class practicequestwodarray {
    public static void main(String[] args) {
        int inputmatrix[][] = new int[5][6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0;i<5;i++){
            for (int j =0;j<6;j++){
                inputmatrix[i][j] = sc.nextInt();
            }
        }
        for (int i = 0;i<5;i++){
            for (int j =0;j<6;j++){
                System.out.print(inputmatrix[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println();
        // to print the matrix in spiral format
        int row_start = 0;
        int row_end = 4;
        int col_start = 0;
        int col_end = 5;
        while(row_start <= row_end && col_start<=col_end){
            for (int i = col_start;i<=col_end;i++){
                System.out.print(inputmatrix[row_start][i]+ "\t");
            }
            row_start ++;
            for (int i = row_start;i<=row_end;i++){
                System.out.print(inputmatrix[i][col_end]+ "\t");
            }
            col_end --;
            for (int i = col_end;i>=col_start;i--){
                System.out.print(inputmatrix[row_end][i]+"\t");
            }
            row_end --;
            for(int i = row_end;i>=row_start;i--){
                System.out.print(inputmatrix[i][col_start]+"\t");
            }
            col_start++;
        
        }
        System.out.println();
        
        // transpose of a twod arrar
        for (int j = 0;j<6;j++){
            for (int i = 0;i<5;i++){
            System.out.print(inputmatrix[i][j]+"\t");
            }
            System.out.println();
        }
        




    }
    
}
