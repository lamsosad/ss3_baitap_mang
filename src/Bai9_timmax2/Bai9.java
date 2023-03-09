package Bai9_timmax2;

import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 54, 34, 6, 8};
        int max = arr[0];
        int max2 = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int block;
            if (max2 < arr[i]) {
                max2 = arr[i];
                if (max2 > max) {
                    block = max;
                    max = max2;
                    max2 = block;
                }
            }
        }
        System.out.println("gia tri lon t2 la: " + max2);
    }
}
