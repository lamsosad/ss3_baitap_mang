package Bai6_tinhtongo1cotxacdinh;

import java.util.Arrays;
import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("nhap chieu dai mang: ");
        int n = input.nextInt();
        System.out.print("nhap chieu rong mang: ");
        int m = input.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("nhap phan tu cho mang " + "[" + i + "," + j + "]: ");
                arr[i][j] = input.nextInt();

            }
        }
        int sumAll = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sumAll += arr[i][j];
            }
        }
        System.out.println(+sumAll);
//        System.out.println(Arrays.deepToString(arr));
        System.out.println(Arrays.deepToString(arr));
        int total = 0;
        System.out.println("nhap cot muon tinh tong: ");
        int sum = input.nextInt();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j == sum) {
                    total += arr[i][j];
                }
            }
        }
        System.out.println("tong la cua cot " + sum + " la: " + total);
    }
}
