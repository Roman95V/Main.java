package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int num_1 = 4;
        int num_2 = 3;
        int num_3 = 3;
        int num_4 = 9;

        if (num_1 <= num_2 && num_1 <= num_3 && num_1 <= num_4)
        {
            System.out.println("Min first number - " + num_1);
        }
        if (num_2 <= num_1 && num_2 <= num_3 && num_2 <= num_4)
        {
            System.out.println("Min second number - " + num_2);
        }
        if (num_3 <= num_1 && num_3 <= num_2 && num_3 <= num_4)
        {
            System.out.println("Min third number - " + num_3);
        }
        if (num_4 <= num_1 && num_4 <= num_2 && num_4 <= num_3)
        {
            System.out.println("Min fourth number - " + num_4);
        }
    }
}
