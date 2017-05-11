package Bonuses;

import java.util.Scanner;

public class RainDrops {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number for the rain to reach.");
        int num = scan.nextInt();

        for (int i = 2; i<=num; i++) {
            while(num % i == 0) {
                System.out.println(num + "|" + i);
                System.out.println("--------");
                num=num/i;
            }
        }
    }
}

