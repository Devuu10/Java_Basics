package Apnacollege.arrays;

import java.util.Scanner;

public class numberArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("please enter the number of variables");
        int size=sc.nextInt();
        int[] numbers=new int[size];

        //input
        for(int i=0;i<size;i++){
            System.out.println("Please enter the "+i+ " number");
            numbers[i]=sc.nextInt();
        }

        int min= Integer.MIN_VALUE;
        int max= Integer.MAX_VALUE;
        //output
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]<min){
                min=numbers[i];
            }
            if(numbers[i]>max){
                max=numbers[i];
             }
        }
        System.out.println("the largest number is "+max);
        System.out.println("the smallest number is "+min);
        sc.close();


    }
    
}