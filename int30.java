package com.company;

import java.util.Scanner;

public class int30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yil = input.nextInt();
        int asr = yil/100+1;
        System.out.println(yil+"-yil, "+asr+"-asrga tegishli");
    }
}
