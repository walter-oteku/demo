package com.bbit;


import java.util.InputMismatchException;
import java.util.Scanner;

public class TestScanner {
    static Scanner scanner= new Scanner(System.in);

    public static void main(String args[]){

    }
    private static void testingException(){
        System.out.println("Enter x");

        try{
            int x;
            x=scanner.nextInt();
            System.out.println("The value of x is: " + x);
        }catch (InputMismatchException ex){
            System.out.println("invalid input");
        }
    }
}
