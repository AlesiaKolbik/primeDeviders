package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите натуральное число:");
        int input = scanner.nextInt();
        for (int i = 1; i <= input; i++) {
            if (input%i==0&&isPrime(i)) {
                System.out.println(i);
            }
        }
    }
    public static boolean isPrime(int number){
        boolean prime=true;
        for(int i=2;i<number;i++) {
            if(number%i==0){
                prime=false;
            }
        }
        return prime;
    }
}
