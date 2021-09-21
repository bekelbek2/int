package com.company;

import java.util.Scanner;

public class int20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sekund, soat;
        sekund = input.nextInt();
        soat = sekund/3600;
        System.out.println(soat);
    }
}
