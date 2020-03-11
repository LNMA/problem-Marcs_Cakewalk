package com.louay.projects;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please input number of cupcake: ");
        int length = input.nextInt();
        System.out.println();

        Integer[] cal = new Integer[length];

        for (int i = 0; i < cal.length; i++) {
            System.out.printf("please input %d cupcake calorie: ", (i + 1));
            cal[i] = input.nextInt();
        }

        double distance = 0;

        mergeSort(cal);
        for (int j = 0; j < cal.length; j++) {
            distance += Math.pow(2, j) * cal[j];
        }


        System.out.println("\nThe minimum number of miles Marc must walk to maintain his weight: " + distance);
    }


    public static void mergeSort(Integer[] list) {
        if (list.length > 1) {
            Integer[] firstHalf = new Integer[list.length / 2];
            System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
            mergeSort(firstHalf);

            Integer secondHalfLength = list.length - list.length / 2;
            Integer[] secondHalf = new Integer[secondHalfLength];
            System.arraycopy(list, list.length / 2,secondHalf, 0, secondHalfLength);
            mergeSort(secondHalf);
            merge(firstHalf, secondHalf, list);
        }
    }

    public static void merge(Integer[] list1, Integer[] list2, Integer[] temp) {
        int current1 = 0;
        int current2 = 0;
        int current3 = 0;

        while (current1 < list1.length && current2 < list2.length) {
            if (list1[current1] > list2[current2]) {
                temp[current3++] = list1[current1++];
            } else {
                temp[current3++] = list2[current2++];
            }
        }

        while (current1 < list1.length) {
            temp[current3++] = list1[current1++];
        }

        while (current2 < list2.length) {
            temp[current3++] = list2[current2++];
        }
    }



}
