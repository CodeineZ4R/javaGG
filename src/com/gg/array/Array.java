package com.gg.array;

/**
 * Created by admin on 21.09.2017.
 */
public class Array {

    public static int[] arrayNum = new int[20];

    public static void main(String[] args) {
        toFillArray();
        goBack();
        transferLast();
        transferFirst();
    }

    public static void toFillArray() {
        for (int i = 0; i < arrayNum.length; i++) {
            arrayNum[i] = i;
            System.out.printf("%d ", arrayNum[i]);
        }
        System.out.println();
    }

    public static void goBack() {
        for (int i = arrayNum.length - 1; i >= 0; i--) {
            System.out.printf("%d ", arrayNum[i]);
        }
        System.out.println();
    }

    public static void transferFirst() {
        int tmp ;

        for (int i = 0; i <arrayNum.length-1 ; i++) {
            tmp = arrayNum[i];
            arrayNum[i] = arrayNum[i+1];
            arrayNum[i+1] =tmp;
        }

        for (int i : arrayNum) {
            System.out.printf("%d ",arrayNum[i]);
        }
        System.out.println();
    }

    public static void transferLast() {
        int tmp;
        for (int i = arrayNum.length - 1; i > 0; i--) {
            tmp = arrayNum[i];
            arrayNum[i] = arrayNum[i-1];
            arrayNum[i-1] = tmp;
        }

        for (int i : arrayNum) {
            System.out.printf("%d ", i);
        }
        System.out.println();
    }

}
