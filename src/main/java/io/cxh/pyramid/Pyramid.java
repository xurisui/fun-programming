package io.cxh.pyramid;

import java.util.Scanner;

/**
 * Created by cxh on 16-7-30.
 */

/***
 * 一个简单的金字塔输出
 */
public class Pyramid {

    public static void main(String[] args) {

        int i, j, k;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入金字塔层数：");
        int n = input.nextInt();

        for (i = 1; i <= n; i ++) {
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (k = j; k <= (2 * i); k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}

