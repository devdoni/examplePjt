package com.green.temp;

import java.util.Scanner;

public class Example24 {
    //24. 출생연도 끝자리(endBirthYear)와 나이(age)를 입력하면 다음 요구사항에 맞춰 마스크 구매 가능한 요일을 출력하는 프로그램을 만드시오.
    //   - 출생년도 1, 6: 월요일 구매 가능
    //   - 출생년도 2, 7: 화요일 구매 가능
    //   - 출생년도 3, 8: 수요일 구매 가능
    //   - 출생년도 4, 9: 목요일 구매 가능
    //   - 출생년도 5, 0: 금요일 구매 가능
    public static void main(String[] args) {
        System.out.println("마스크 구매 가능한 요일 출력 프로그램");

        Scanner scanner = new Scanner(System.in);

        System.out.println("출생연도 끝자리를 입력해주세요(0~9)");
        int birthOfYear = scanner.nextInt();

        if (birthOfYear < 0 || birthOfYear > 9) {
            System.out.println("올바른 출생연도 끝자리를 입력해주세요");
        } else {
            switch (birthOfYear) {
                case 1, 6:
                    System.out.println("끝자리 1, 6년 생은 월요일에 마스크 구매가 가능합니다.");
                    break;
                case 2, 7:
                    System.out.println("끝자리 2, 7년 생은 화요일에 마스크 구매가 가능합니다.");
                    break;
                case 3, 8:
                    System.out.println("끝자리 3, 8년 생은 수요일에 마스크 구매가 가능합니다.");
                    break;
                case 4, 9:
                    System.out.println("끝자리 4, 9년 생은 목요일에 마스크 구매가 가능합니다.");
                    break;
                case 5, 0:
                    System.out.println("끝자리 5, 0년 생은 금요일에 마스크 구매가 가능합니다.");
                    break;
            }
        }
        scanner.close();

    }
}
