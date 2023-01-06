package Ludmila;

import java.util.Scanner;

public class Odd_Even {
    public static void main(String[] args) {
            Scanner num=new Scanner(System.in);
            System.out.println("Enter your number:");
            int n=num.nextInt();
            String number="";

/*
       if(n%2!=0){
           number="Odd";
       }else{
           number="Even";
       }
        System.out.println("number "+n +" it's "+ number+" number");

        System.out.println("------------------------------------------------");*/
            String result=(n%2!=0)?"Odd":"Even";
            System.out.println("result = " + result);




        }
}
