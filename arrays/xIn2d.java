package Apnacollege.arrays;

import java.util.Scanner;

public class xIn2d {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the rows and columns");
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int [][] numbers=new int [rows][cols];
        //input
        //rows
        for(int i=0;i<rows;i++){
            System.out.println("please enter the numbers:");
            //columns
            for(int j=0;j<cols;j++){
                numbers[i][j]=sc.nextInt();
            }
        }
            System.out.println("Please enter the x :");
            int x=sc.nextInt();

        
        //output
        for(int i=0;i<rows;i++){
            //columns
            for(int j=0;j<cols;j++){
                if(numbers[i][j]==x){
                    System.out.println("x found at location ["+ i+","+ j+ "]");
                }

    }
    
}
sc.close();

    }
}
