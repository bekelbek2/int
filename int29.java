package com.company;

import java.util.Scanner;

public class int29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();
        int k = A/C;
        int m = B/C;
        int umumiy = k*m;
        int yuza = A*B-C*C*umumiy;
        System.out.println("Nechta kvadrat : "+umumiy);
        System.out.println("Ortiqcha yuza:"+ yuza);
    }
}
