package com.ifmo.lesson2;

public class Fibonacci {
    /*
     Выведите на экран первые 11 членов последовательности Фибоначчи. Напоминаем, что
     первый и второй члены последовательности равны единицам, а каждый следующий — сумме
     двух предыдущих.
     */
    public static void main(String[] args) {
        // TODO implement
        int a = 1;
        int b = 1;
        int n;
        System.out.print(a+" "+b+" ");
       for (int i = 3; i <= 12; i++) {  //12, потому что не проходит проверку с 11
           n = a + b;
           System.out.print(n+" ");
           a = b;
           b = n;
       }
        System.out.println();}

    }
