package com.green.temp;

import java.util.Random;
import java.util.Scanner;

public class Example30 {
    // 30. 컴퓨터와 사용자가 ‘난수를 이용한 가위 바위 보 게임’을 하는 게임을 만들자.
    public static void main(String[] args) {
        System.out.println("난수를 이용한 가위 바위 보 게임");

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("1.가위 2.바위 3.보");
        int userRandomNum = sc.nextInt();
        int min = 1;
        int max = 3;
        int randomInt = random.nextInt((max-min) + 1) + min;

        switch (randomInt) {
            case 1:
                System.out.println("가위 입니다");
                if (randomInt == userRandomNum ) {
                    System.out.println("무승부!");

                } else if ( userRandomNum == 3 ) {
                    System.out.println("유저 패배!");

                } else {
                    System.out.println("유저 승!");

                } break;
            case 2:
                System.out.println("바위 입니다");
                if (randomInt == userRandomNum ) {
                    System.out.println("무승부!");

                } else if ( userRandomNum == 1 ) {
                    System.out.println("유저 패배!");

                } else {
                    System.out.println("유저 승!");

                } break;
            case 3:
                System.out.println("보 입니다!");
                if (randomInt == userRandomNum ) {
                    System.out.println("무승부!");

                } else if ( userRandomNum == 2 ) {
                    System.out.println("유저 패배!");
                } else {
                    System.out.println("유저 승!");
                }

        }
    }
}
