package Apnacollege.first;
import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = a + b;
        int diff = a-b;
        int mlt= a*b;
        int div = a/b;
        int rem = a%b;

        System.out.println(sum);
        System.out.println(diff);
        System.out.println(mlt);
        System.out.println(div);
        System.out.println(rem);
        sc.close();

        
    }
    
}
