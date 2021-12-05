package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int num_1 = -4;
        int num_2 = 3;
        int num_3 = 3;
        int num_4 = 9;

        if (num_1 <= num_2 && num_1 <= num_3 && num_1 <= num_4)
        {
            System.out.println("Min number: " + num_1);
        }
        else if (num_2 <= num_1 && num_2 <= num_3 && num_2 <= num_4)
        {
            System.out.println("Min number: " + num_2);
        }
        else if (num_3 <= num_1 && num_3 <= num_2 && num_3 <= num_4)
        {
            System.out.println("Min number: " + num_3);
        }
        else if (num_4 <= num_1 && num_4 <= num_2 && num_4 <= num_3)
        {
            System.out.println("Min number: " + num_4);
        }
    }
}
