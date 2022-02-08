package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int math, physics, chemical, turkish, music,tarih;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, Write math quiz score :" );
        math = scanner.nextInt();

        System.out.println("Please, Write physics quiz score :" );
        physics = scanner.nextInt();

        System.out.println("Please, Write chemical quiz score :" );
        chemical = scanner.nextInt();

        System.out.println("Please, Write turkish quiz score :" );
        turkish = scanner.nextInt();

        System.out.println("Please, Write music quiz score :" );
        music = scanner.nextInt();

        System.out.println("Please, Write tarih quiz score :" );
        tarih = scanner.nextInt();

        double average = (math+physics+chemical+turkish+music+tarih)/6.0;
        System.out.println("Ortalamanız : " + average);

        String passed = average >= 60 ? "Geçtin" : "Kaldın";
        System.out.println(passed);

    }
}
