package com.company;

import java.util.Scanner;

public class int19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sekund, minut;
        sekund = input.nextInt();
        minut = sekund/60;
        System.out.println(minut);
    }
}
