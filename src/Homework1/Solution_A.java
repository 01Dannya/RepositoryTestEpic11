package Homework1;

import java.util.Scanner;

public class Solution_A {

    public static void main(String[] args) {

        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int input1 = scanner.nextInt();
        int input2 = scanner.nextInt();
        int input3 = scanner.nextInt();
        
        boolean a = (input1 > input2) && input2 > input3;
        System.out.println(a);
            
        scanner.close();
            


    }


}
