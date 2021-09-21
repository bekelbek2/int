package com.company;

import java.util.Scanner;

public class int17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;
        a = input.nextInt();
        b = (a%1000)/100;
        System.out.println(b);
    }
}
