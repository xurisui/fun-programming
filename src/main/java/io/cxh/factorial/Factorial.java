package io.cxh.factorial;

/**
 * 阶乘运算
 * 1!+2!+3!+4！+5！+...+10！=sum
 * Created by cxh on 16-7-31.
 */
public class Factorial {

    public static void main(String[] args) {
        int sum, mul;
        mul = 1;
        sum = 0;
        for (int i = 1; i < 11; i++) {

            for (int j = 1; j <= i; j++) {
                mul = i * j;
            }
            sum += mul;
        }
        System.out.println(sum);
    }
}
