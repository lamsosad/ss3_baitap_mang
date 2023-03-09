package Bai5_giatrinhonhat;

import java.util.Arrays;
import java.util.Scanner;

public class bai5 {
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
        System.out.println(Arrays.deepToString(arr));
        int min = arr[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (min > arr[i][j]) {
                    min = arr[i][j];
                }
            }
        }
        System.out.println("gia tri nho nhat la: " + min);
    }
}
