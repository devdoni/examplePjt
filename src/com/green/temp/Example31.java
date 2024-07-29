package com.green.temp;

import java.util.Scanner;

public class Example31 {
    //31. 369 게임을 만들어 봅시다. 1부터 99까지 1씩 증가하면서 숫자에 3, 6, 9가 들어 있을 때마다 ‘짝!’을 출력한다.
    public static void main(String[] args) {
        System.out.println("369 게임!!");

        Scanner sc = new Scanner(System.in);

        boolean gameFlag = true;

        while (gameFlag) {
            System.out.println("1. 게임 시작 99.게임 종료");
            int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("게임 시작!");
                            for (int i = 1; i < 100; i++ ) {
                                String numberStr = String.valueOf(i);

                                if (numberStr.contains("3") || numberStr.contains("6") || numberStr.contains("9")) {
                                    System.out.println("짝 !!");
                                } else {
                                    System.out.println(i);
                                }
                                try {
                                    Thread.sleep(200);
                                } catch (InterruptedException e) {
                                    Thread.currentThread().interrupt();
                                    System.out.println("스레드가 인터럽트 되었습니다.");
                                }
                            }

                    case 99:
                        System.out.println("게임 종료!");
                        gameFlag = false;
                }
        }

    }
}
