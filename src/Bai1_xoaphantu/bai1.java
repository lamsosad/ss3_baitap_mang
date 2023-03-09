package Bai1_xoaphantu;

import java.util.Arrays;
import java.util.Scanner;

public class bai1 {
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
        System.out.println("nhap phan tu muon xoa");
        int del = input.nextInt();
        int[] newArr = new int[n-1];
        for (int i = 0; i < arr.length; i++) {
            if (del==arr[i]){
                for (int j = 0; j < i; j++) {
                    newArr[j]=arr[j];
                }
                for (int j =i +1; j < arr.length ; j++) {
                    newArr[j-1]=arr[j];
                }
            }
        }
        System.out.println(Arrays.toString(newArr));
    }
}
