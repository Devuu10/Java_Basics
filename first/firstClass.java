package Apnacollege.first;
 import java.util.*;
;class firstClass {


public static void main(String[] args) {
    System.out.println("Hello World");
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
    System.out.println(name);       
    int age= sc.nextInt();
    if (age >=18) {
        System.out.println("adult");
    }
    else {
        System.out.println("not adult");
    }
    System.out.println();
    sc.close();

}
}