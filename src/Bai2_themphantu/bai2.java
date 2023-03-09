package Bai2_themphantu;

import java.util.Arrays;
import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap so luong phan tu: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("nhap phan tu thu " + (i + 1) +": ");
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("nhap phan tu muon them: ");
        int add = input.nextInt();
        int[] newArr = new int[n+1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i]=arr[i];
        }
        newArr[n]=add;
        System.out.println(Arrays.toString(newArr));
    }
}
