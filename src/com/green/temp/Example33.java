package com.green.temp;

import java.util.Scanner;

public class Example33 {
    // 33. 1~10 사이의 정수를 출력하되, 정수가 3의 배수이면 ‘3의 배수!’ 출력하는 프로그램을 만들자.
    public static void main(String[] args) {
        System.out.println("1~10 사이의 정수를 출력하되, 정수가 3의 배수이면 ‘3의 배수!’ 출력하는 프로그램");
        Scanner sc = new Scanner(System.in);
        int userSelectedNum;
        boolean systemFlag = true;

        while (systemFlag) {
            System.out.println("1. 프로그램 시작 99. 프로그램 종료");
            userSelectedNum = sc.nextInt();
            switch (userSelectedNum) {
                case 1:
                    System.out.println("프로그램 시작");
                    for (int i = 1; i <= 10; i++) {
                        if (i % 3 == 0) {
                            System.out.println("3의 배수!");
                        } else {
                            System.out.println(i);
                        }
                    }
                    break;
                case 99:
                    systemFlag = false;
            }
        }
    }
}
