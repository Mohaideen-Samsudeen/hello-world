package com.example.firstproject;

import java.util.Scanner;
import java.util.logging.Logger;

public final class HelloWorld {
    private static final Logger LOGGER = Logger.getLogger(HelloWorld.class.getName());

    public static void main(final String[] args) {
        Long num = 10L;
        System.out.println(findFactorial(10L));

        Scanner s = new Scanner(System.in);
        String first = s.nextLine();
        String second = s.nextLine();
        String s1 = "32";

        Integer number = 14567;
        System.out.println(Integer.reverse(14567));
    }

    public static Long findFactorial(Long num) {
        return (num == 0L) ? 1L : num * findFactorial(num - 1);
    }

}
