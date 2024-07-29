package com.green.temp;

import java.util.Scanner;

public class Example23 {
    // 23. 사용자가 입력한 양의 정수를 3으로 나눈 후, 소수점 첫 자리에서 반올림한 정수를 출력하는 프로그램을 만들자.
    public static void main(String[] args) {
        System.out.println("소수점 첫 자리 반올림 프로그램");
        Scanner scanner = new Scanner(System.in);

        System.out.println("숫자를 입력해주세요");
        int inputNum = scanner.nextInt();

        double divideNum = (double) inputNum / 3;
        int outputNum = (int) Math.round(divideNum);
        System.out.printf("%d로 3을 나눈 후 소수첨 첫 자리에서 반올림한 정수는 %d 입니다", inputNum, outputNum);

        scanner.close();
    }
}
