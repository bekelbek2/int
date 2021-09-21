package com.company;

import java.util.Scanner;

public class int21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sekund, minut, chalasekund;
        sekund = input.nextInt();
        minut = sekund/60;
        chalasekund = sekund - sekund/60*60;
        System.out.println(minut+" "+"Minut, "+chalasekund+" sekund");
    }

}

