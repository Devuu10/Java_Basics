package Apnacollege.arrays;

import java.util.Scanner;

class ascending {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the size");
        int size=sc.nextInt();
        int[] ascendingOrder=new int[size];
        
        //input
        for(int i=0;i<size;i++){
            System.out.println("Please enter the "+i+ " number");
            ascendingOrder[i]=sc.nextInt();
        }
        boolean ascend=true;
        for(int i=0;i<size-1;i++){
            if(ascendingOrder[i]>ascendingOrder[i+1]){
                ascend=false;
            }
        }
        if(ascend){
            System.out.println("the numbers are in ascending order");
        }
        else{
            System.out.println("the numbers are not in ascending order");

        }
        sc.close();

    }
    
}
