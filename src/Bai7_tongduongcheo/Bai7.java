package Bai7_tongduongcheo;

import java.util.Arrays;
import java.util.Scanner;

public class Bai7 {
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
        int total1 = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    total += arr[i][j];
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i + j== arr.length-1) {
                    total1 += arr[i][j];
                }
            }

        }
        System.out.println("tong 2 duong cheo la: " + total+" , "+total1);

    }
}
