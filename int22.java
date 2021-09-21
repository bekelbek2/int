package com.company;

import java.util.Scanner;

public class int22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sekund, soat, chalasekund;
        sekund = input.nextInt();
        soat = sekund/3600;
        chalasekund = sekund - soat*3600;
        System.out.println(soat+" "+"soat, "+chalasekund+" sekund");
    }
}
