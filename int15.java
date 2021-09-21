package com.company;

import java.util.Scanner;

public class int15 {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a, b;
    a = input.nextInt();
    b = a/100*10+(a%100)/10*100+a%10;
        System.out.println(b);
    }
}
