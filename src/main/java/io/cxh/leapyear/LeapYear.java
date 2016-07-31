package io.cxh.leapyear;

import java.util.Scanner;

/**
 * Created by cxh on 16-7-31.
 */
public class LeapYear {
    public static void main(String[] args) {
        System.out.println("pelase enter a year:");
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();

        if ((year%4 == 0 && year%100 == 0) || year%400 == 0) {
            System.out.println(year + "years is leap year!");
        }
        else {
            System.out.println(year + " years is not leap year!");
        }

    }
}
