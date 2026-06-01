// Factorial of a Number

import java.util.Scanner;

public class Main{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter An Integer:");
        
        int num = sc.nextInt();
        
        int fact = 1;
        
        for(int i = num; i >= 1; i--){
            fact = fact * i;
        }
        
        System.out.println("Factorial of "+ num + " is " +fact);
    }
}
