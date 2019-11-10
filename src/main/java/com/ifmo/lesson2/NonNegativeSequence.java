package com.ifmo.lesson2;

public class NonNegativeSequence {
    /*
    Создайте программу, выводящую на экран все неотрицательные элементы
    последовательности 90 85 80 75 70 65 60 ….
     */
    public static void main(String[] args) {
        // TODO implement
        for(int a=95;a>0;a=a-5)  //Выражение x -= b означает x = x - b.
            System.out.print(a+" ");

    }
}
