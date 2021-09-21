package com.company;

import java.util.Scanner;

public class int23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sekund, minut, soat, chalasekund;
        sekund = input.nextInt();
        soat = sekund/3600;
        minut = (sekund - soat*3600)/60;
        chalasekund = sekund-soat*3600-minut*60;
        System.out.println(soat+" "+"SOat, "+minut+" minut, "+chalasekund+" sekund");
    }
}
