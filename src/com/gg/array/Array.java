package com.gg.array;

/**
 * Created by admin on 21.09.2017.
 */
public class Array {

    public static int[] arrayNum = new int[20];

    public static void toFillArray() {
        for (int i = 0; i < arrayNum.length; i++) {
            arrayNum[i] = i;
            System.out.print(arrayNum[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        toFillArray();
    }


}
