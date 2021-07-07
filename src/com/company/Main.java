package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap kich co N cua mang: ");
        int N = scanner.nextInt();
        int array[] = new int[N];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        //Nhập giá trị X
        System.out.println("Nhập giá trị X cần chèn: ");
        int X = scanner.nextInt();
        System.out.println("Nhập vị trí của X cần chèn: ");
        int index = scanner.nextInt();
        int[] newarray = new int[N + 1];

        for (int i = 0; i < index; i++) {
            newarray[i] = array[i];
        }
        newarray[index]  = X;
        for (int i = index+1;i<newarray.length;i++){
            newarray[i] = array[i-1];
        }
//        for (int i = 0; i < N+1; i++) {
//            if (i < index) {
//                newarray[i] = array[i];
//            } else if (i == index) {
//                newarray[i] = X;
//            } else {
//                newarray[i] = array[i + 1];
//            }
//        }
        //Hien thi chuoi moi da tao
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j = 0; j < newarray.length; j++) {
            System.out.print(newarray[j] + "\t");


        }

    }
}

