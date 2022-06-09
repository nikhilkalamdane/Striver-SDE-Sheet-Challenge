/**
 * SetMatrixZeros
 */

import java.util.*;

public class SetMatrixZeros {

    static void printMatrix(int [][] mat){
        System.out.println("\n---------");
        for(int i = 0; i < mat.length; i++){
            for(int j  = 0; j < mat[i].length; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void setZeros(int[][] mat){
        int col0 = 1;
        for(int i = 0; i < mat.length; i++){
            if(mat[i][0] == 0){
                col0 = 0;
            }
            for(int j = 1; j < mat[i].length; j++){
                if(mat[i][j] == 0){
                    mat[i][0] = mat[0][j] = 0;
                }
                
            }
        }
        
        for(int i = mat.length - 1; i >= 0; i--){
            for(int j = mat[i].length - 1; j >= 1; j--){
                if(mat[i][0] == 0 || mat[0][j] == 0){
                    mat[i][j] = 0;
                }
            }
            if (col0 == 0) mat[i][0] = 0;
        }

        printMatrix(mat);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T > 0){
            int rows = sc.nextInt();
            int cols = sc.nextInt();

            int[][] matrix = new int[rows][cols]; 

            for(int i = 0; i < rows; i++){
                for(int j  = 0; j < cols; j++){
                    matrix[i][j] = sc.nextInt();
                }
            }
            T--;
            setZeros(matrix);
            
        }
        sc.close();
    }
}