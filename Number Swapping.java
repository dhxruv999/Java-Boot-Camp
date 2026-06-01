//Swapping

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Two Integers:");
        
        int a, b;
        
        a = sc.nextInt();
        b = sc.nextInt();
        
        int temp = a;
        a = b;
        b = temp;
        
        System.out.println(a);
        System.out.println(b);
        
    }
}
