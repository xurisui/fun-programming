package io.cxh.yanghuisanjiao;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 杨辉三角
 * Created by cxh on 16-7-30.
 */

public class YangHui {
    public static void main(String[] args) {

        System.out.println("please input the row number:");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int [][]arr = getTriangle(n);

        getTriangle(n);
        printTriangle(arr);
    }

    private static int[][] getTriangle(int n) {  //设计杨辉三角
        int[][] yang = new int[n][n];
        for (int i = 0; i < yang.length; i ++) {  //初始化数字为1的杨辉三角
            yang[i][0] = 1;
            yang[i][i] = 1;
        }
        for (int i = 1; i < yang.length; i ++) {  //外循环控制 行
            for (int j = 1; j <= i; j++) {   //内循环控制 列
                yang[i][j] = yang[i - 1][j - 1] + yang[i - 1][j];
            }
        }
        return yang;
    }

    private static void printTriangle(int [][] arr) {  //打印杨辉三角
        for (int i = 0; i < arr.length; i ++) {
            for (int j = 0; j <= i; j ++) {
                int res = arr[i][j];
                System.out.printf("%-5d",res);
            }
            System.out.println();
        }
    }
}
