package com.green.temp;

import java.util.Scanner;

public class Example34 {
    // 34. 사용자가 원하는 구구단을 출력하는 프로그램을 만들자.
    public static void main(String[] args) {
        System.out.println("사용자가 원하는 구구단을 출력하는 프로그램");

        Scanner sc = new Scanner(System.in);
        boolean systemFlag = true;
        int userSelectedMenuNum;
        int userSelectedNum;

        while (systemFlag) {
            System.out.println("1. 프로그램 시작 99. 프로그램 종료");
            userSelectedMenuNum = sc.nextInt();

            switch (userSelectedMenuNum) {
                case 1:
                    System.out.println("원하는 2~9 사이의 숫자를 입력해주세요");
                    userSelectedNum = sc.nextInt();
                    for (int i = 1 ; i < 10; i++) {
                        if (userSelectedNum == 1 || userSelectedNum >= 10) {
                            System.out.println("2~9까지의 숫자만 이용해주세요");
                            break;
                        }
                        System.out.printf("%d X %d = %d%n", userSelectedNum, i , userSelectedNum * i);
                    } break;
                case 99:
                    System.out.println("시스템 종료");
                    systemFlag = false;
            }
        }
    }
}
