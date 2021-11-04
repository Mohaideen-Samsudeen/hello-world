package com.example.firstproject;

import java.util.Scanner;

public class ScannerCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer in = Integer.valueOf(scanner.nextLine());
        String s = scanner.nextLine();
        System.out.println(in * 2);
        System.out.println(s);
    }
}
