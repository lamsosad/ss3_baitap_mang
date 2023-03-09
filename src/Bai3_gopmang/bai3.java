package Bai3_gopmang;

import java.util.Arrays;
import java.util.Scanner;

public class bai3 {
    private static int[] newArr;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap so luong phan tu them vao mang 1: ");
        int n = input.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("nhap phan tu thu " + (i + 1) + ": ");
            arr1[i] = input.nextInt();
        }
        System.out.println("nhap so luong phan tu them vao mang 2: ");
        int m = input.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < arr2.length; i++) {
            System.out.print("nhap phan tu thu " + (i + 1) + ": ");
            arr2[i] = input.nextInt();
        }
        System.out.println("\n Mang 1: " + Arrays.toString(arr1));
        System.out.println(" Mang 2: " + Arrays.toString(arr2));
        int[] newArr = new int[n + m];
        for (int i = 0; i < newArr.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                newArr[j] = arr1[j];
            }
            for (int j = i; j < arr2.length; j++) {
                newArr[j + n] = arr2[j];
            }
        }
        System.out.println("\n Mang moi: " + Arrays.toString(newArr));
    }
}
