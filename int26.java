package com.company;

import java.util.Scanner;

public class int26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sana = input.nextInt();
        if (sana>0&&sana<366){
            if (sana%7==1){
                System.out.println("SESHANBA");
            }
            else if (sana%7==2){
                System.out.println("chorshanba");
            }
            else if (sana%7==3){
                System.out.println("payshanba");
            }
            else if (sana%7==4){
                System.out.println("juma");
            }
            else if (sana%7==5){
                System.out.println("shanba");
            }
            else if (sana%7==6){
                System.out.println("yakshanba");
            }
            else if (sana%7==0){
                System.out.println("dushanba");
            }

        }
        else {
            System.out.println("XATO");
        }
    }
}
