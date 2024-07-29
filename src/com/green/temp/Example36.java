package com.green.temp;

import java.util.Scanner;

public class Example36 {
    // 36. 1부터 사용자가 입력한 정수까지의 합을 구하는 프로그램을 만들자.
    public static void main(String[] args) {
        System.out.println("사용자가 입력한 정수까지의 합을 구하는 프로그램");

        Scanner sc = new Scanner(System.in);

        System.out.println("원하는 숫자를 입력해주세요.");
        int userChoice = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= userChoice; i++) {
            sum += i;
        }
        System.out.printf("1부터 %d까지의 합은 %d입니다%n", userChoice, sum);
    }
}
