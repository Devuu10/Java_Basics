package Apnacollege.arrays;

public class dynamicArray {
    public static void main(String[] args) {
        int [][] arr = {
            {1,3,5,7},
            {9,11},
            {13,15,17,19}
        };

        for(int row=0; row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                System.out.print(arr[row][col]+ " ");
            }
            System.out.println();
        }
    }
    
}
