package com.green.temp;

import java.util.Scanner;

public class Example32 {
    //32. 2~100 사이의 짝수 출력하는 프로그램을 만들자.
    public static void main(String[] args) {
        System.out.println("2~100 사이의 짝수를 출력하는 프로그램");
        Scanner sc = new Scanner(System.in);
        int userSelectedNum;

        boolean systemFlag = true;
        while (systemFlag) {
            System.out.println("1.프로그램 시작 99.프로그램 종료");
            userSelectedNum = sc.nextInt();
            switch (userSelectedNum) {
                case 1:
                    System.out.println("프로그램 시작");
                    for (int i = 2; i < 100; i++) {
                        if (i % 2 == 0) {
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
