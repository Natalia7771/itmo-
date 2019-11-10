package com.ifmo.lesson2;

public class Progression {
    /*
     Создайте программу, выводящую на экран все четырёхзначные числа последовательности
     1000 1003 1006 1009 1012 1015 ….
     */
    public static void main(String[] args) {
        // TODO implement
        for (int a = 1000; a < 10000; a = a + 3)  //Выражение x -= b означает x = x - b.
            System.out.print(a + " ");
    }
}
