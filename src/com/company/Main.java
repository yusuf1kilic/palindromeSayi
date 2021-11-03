package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        //Kullanıcının girdiği 3 basamaklı sayının palindrome sayı olup olmadığını bulan kodu yazınız-->121
        System.out.print("lütfen 3 basamaklı bir değer gririniz : ");
        int number= input.nextInt();
        int mod,mod2;
        mod=number%10;



        int result;
        result=(mod*100)+number%100;
        System.out.println(result);
        if (number==result){
            System.out.println("bu sayı palindrome : "+number);
        }else
            System.out.println("bu sayı palindorme sayı değildir : " +number);


    }
}
