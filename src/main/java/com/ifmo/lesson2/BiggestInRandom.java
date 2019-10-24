package com.ifmo.lesson2;

import java.util.Random;

public class BiggestInRandom {
    /*
     Создать программу, выводящую на экран случайно сгенерированное трёхзначное
     натуральное число и его наибольшую цифру.Примеры работы программы:
     В числе 208 наибольшая цифра 8.
     В числе 774 наибольшая цифра 7.
     В числе 613 наибольшая цифра 6.
     */
    public static void main(String[] args) {
        int rnd = threeDigitRandom();

        String largestDigit = largestDigit(rnd);

        System.out.println(largestDigit);
    }

    public static int threeDigitRandom() {
        // TODO implement
        Random rnd = new Random();


        return 100 + rnd.nextInt (899);
    }

    public static String largestDigit(int rnd) {
        // TODO implement
        int a=rnd/100;
        int b=(rnd-a*100)/10;
        int c=rnd-a*100-b*10;
        int max = 0;
        if (a>=b && a>=c) {
            max = a;
        } else if (b>=a && b>=c) {
            max = b;
        } else
            max = c;

        return "В числе " + rnd + " наибольшая цифра " + max + ".";
    }
}
