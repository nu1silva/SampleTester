package com.nu1silva.sampletester.arrays;

import java.util.Arrays;

public class SortArray {

    public static void main(String args[]) {

        int[] list = {1, 2, 3, 4, 5};

        for (int i = 0; i < list.length / 2; i++) {
            int temp = list[i];
            list[i] = list[list.length - i - 1];
            list[list.length - i - 1] = temp;
        }

        System.out.println(Arrays.toString(list));
    }
}
