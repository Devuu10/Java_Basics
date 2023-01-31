package Apnacollege.arrays;

import java.util.Scanner;

public class spiralMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the row and column :");
        int n=sc.nextInt();
        int m= sc.nextInt();
       
       
        int [][]matrix=new int [n][m];
        //input
        for(int i=0;i<n;i++){
            System.out.println("please enter the numbers");
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        int rowStart=0;
        int rowEnd=n-1;
        int colStart=0;
        int colEnd=m-1;
        System.out.println("the spiral matrix order is :");

        while(rowStart<=rowEnd && colStart<=colEnd){

            //--------->
            for(int col=colStart;col<=colEnd;col++){
                System.out.print(matrix[rowStart][col]+ " ");
            }
            rowStart++;

            //downward
            for(int row=rowStart;row<=rowEnd;row++){
                System.out.print(matrix[row][colEnd] + " ");
            }
            colEnd--;

            //<---------
            for(int col=colEnd;col>=colStart;col--){
                System.out.print(matrix[rowEnd][col]+ " ");
            }
            rowEnd--;

            //upward
            for(int row=rowEnd;row>=rowStart;row--){
                System.out.print(matrix[row][colStart]+ " ");
            }
            colStart++;

            System.out.println();

        }
        sc.close();




    }
    
}
