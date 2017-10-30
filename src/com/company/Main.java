package com.company;

import java.nio.Buffer;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //funct();
        //bibl();
        //sport();
        /////////////////////sportFig();

        // write your code here
    }
/*public static void sportFig(){
        int i;
        int ball=0;
        int  rez1=0;
        int rez2=0;
        int rez3=0;

        Random ran = new Random(10);
        int array[] = new int[18];
        for(i=0; i < array.length; i++) {
            array[i] = ran.nextInt(10);
            if (i < 6){
                rez1 = rez1+array[i];
                System.out.println("По первым 6 дисциплинам > всего\t" + rez1);
            }
            if (i > 6 && i<12){
                rez2 = rez2+array[i];
                System.out.println("По короткой программе\t" + rez2);
            }
            if (i > 12){
                rez3=rez3+array[i];
                System.out.println("По произвольной программе\t" + rez3);
            }

          /*  if (rez1 > rez2 && rez1 > rez3 ){

                }
                if (rez2 > rez1 && rez2 > rez3 ){

                }
            if (rez3 > rez1 && rez3 > rez2 ){

            }*/


    public static void funct() {
        Scanner scaner = new Scanner(System.in);
        double x;
        double a;
        double b;
        double h;
        double rez = 0;
        System.out.println("Vvedite a");
        a = scaner.nextDouble();
        System.out.println("Vvedite b");
        b = scaner.nextDouble();
        System.out.println("Vvedite h");
        h = scaner.nextDouble();
        System.out.println("Vvedite x");
        // x = scaner.nextDouble();
        // System.out.println(x);
        while (a < b) {
            rez = (Math.sin(a));
            System.out.print("argument x=" + a);
            System.out.println("\t" + rez);
            a = a + h;
        }
    }

    public static void bibl() {
        int i;
        int books;
        int summ = 0;
        Random ran = new Random(35);
        Scanner scanner = new Scanner(System.in);
        int array[] = new int[35];
        for (i = 0; i < array.length; i++) {
            array[i] = ran.nextInt(10000);
            summ = summ + array[i];
        }
        if (summ >= 100000 && summ <= 999999) {
            System.out.println("Число не больше\t" + summ);
        }
        System.out.println("Число больше\t" + summ);

    }

    public static void sport() {
        int i;
        int ball = 0;
        int rez = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите проходной балл");
        ball = scanner.nextInt();
        Random ran = new Random(10);
        int array[] = new int[10];
        for (i = 0; i < array.length; i++) {
            array[i] = ran.nextInt(10);
            rez = rez + array[i];
        }
        if (rez > ball) {
            System.out.println("Проходит, набрал\t" + rez);
        }
        if (rez < ball) {
            System.out.println("Не проходит, набрал\t" + rez);
        }


    }

    /*public static void massDouble() {
        int i = 0;
        int rez=0;
        int count = 0;
        {
            Random random = new Random(10);
            double array[] = new double[50];
            for (i = 0; i < array.length; i++) {
                array[i] = random.nextDouble(10);
            }
            for(i=0; i < array.length; i++){
                count = count
            }


        }
    }*/
    public static void massN()
    {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размерность массива");
    }
}