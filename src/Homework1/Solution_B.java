package Homework1;

import java.util.Scanner;

public class Solution_B {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.next();
        int input2 = scanner.nextInt();
        int input3 = scanner.nextInt();
        
        int newInt = input2 + input3;
        
        System.out.println("My string is \"" +input1+"\"");
        
        System.out.println("The sum of the "+input2+ " and "+input3+" is "+newInt);
        
        scanner.close();

    }

}