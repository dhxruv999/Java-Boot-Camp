//Conditional Branching -- Nested if-else

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Your Age:");
        
        int age = sc.nextInt();
        
        if( age >= 18 ){
            if( age >= 100 ){
                System.out.println("You can vote in your home!");
            } else {
                System.out.println("You can vote in booth only!");
            }
            
        } else {
            if( age < 0 ){
                System.out.println("Enter a valid age!");
            } else {
                System.out.println("You are not eligible for voting!");
            }
        }
    }
}
