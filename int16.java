package com.company;

import java.util.Scanner;

public class int16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;
        a = input.nextInt();
        b = (a%10)*10+a/100*100+(a%100)/10;
        System.out.println(b);
    }
}
