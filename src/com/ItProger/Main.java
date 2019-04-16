package com.ItProger;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите ваше имя: ");
//        String name = in.nextLine();
//        System.out.println("Привет, " + name +"!");
//    }

//    public static void main(String[] args ) {
//            for(int i = args.length - 1; i >= 0; i--) {
//                System.out.print(args[i] + " ");
//            }
//            System.out.println();
//            for(int i = args.length - 1; i >= 0; i--) {
//                System.out.println(args[i] + " ");
//            }
//        }

//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите пароль: ");
//        String name = in.nextLine();
//        if (name.equals("qwerty")  )
//            System.out.println("Пароль верныйю.");
//        else System.out.println("Не верный пароль!");
//    }

    public static void main(String[] args ) {
        int sum =0, umn = 1;
        for (int i = 0; i < args.length; i++) {
            sum += Integer.parseInt(args[i]);
            umn *= Integer.parseInt(args[i]);
        }
        System.out.println(sum +" (" +umn + ")");
        System.out.println("Быданов");
        System.out.println("\"Дата и время получения задания:\" 12.04.2019 18:00");
        System.out.println("\"Дата и время выполнения задания:\" 16.04.2019 23:59");
    }
}