package Apnacollege.arrays;

import java.util.Scanner;

public class transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the rows and columns :");
        int n = sc.nextInt();
        int m = sc .nextInt();
        int [][] matrix= new int [n][m];
        for(int i=0;i<n;i++){
        System.out.println("please enter the numbers :");
        for(int j=0;j<m;j++){
            matrix[i][j]=sc.nextInt();
        }
    
    }
    System.out.println("the original matrix is :");
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            System.out.print(matrix[i][j]+" ");
        }
    
    }
    System.out.println();

    System.out.println("the transpose of the matrix :");
    for(int j=0;j<m;j++){
        for(int i=0;i<n;i++){
            System.out.print(matrix[i][j]+" ");  
        }
    }
    sc.close();

}
    
}
