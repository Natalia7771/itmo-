package com.ifmo.lesson2;

public class SymmetricClocks {
    /*
    Электронные часы показывают время в формате от 00:00 до 23:59. Подсчитать сколько
    раз за сутки случается так, что слева от двоеточия показывается симметричная комбинация
    для той, что справа от двоеточия (например, 02:20, 11:11 или 15:51)
     */
    public static void main(String[] args) {
        System.out.println(symmetricTimes());
    }

    public static int symmetricTimes() {
        // TODO implement
        int x = 0;
        for (int i=0000;i<2360;i++){
            int i1=i/1000%10,
                    i2=i/100%10,
                    i3=i/10%10,
                    i4=i%10;
            if(i1==i4 && i2==i3){
                x++;
            }
        }

        return x;
    }
}
