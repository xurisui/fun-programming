package io.cxh.multiplication;

/**
 * Created by cxh on 16-7-30.
 */

/**
 * 九九乘法表
 */
public class MultiplicationTable {

    public static void main(String[] args) {
        int i, j;
        for (i = 1; i < 10; i++) {
            for (j = 1; j <= i; j++) {
                out(i, j);
            }
            System.out.print("\n");
        }
    }


    public static void out(int fristNumber, int secondNumber) {
        int result = fristNumber * secondNumber;
        System.out.print(fristNumber + "*" + secondNumber + "=" + result + " ");
    }
}
