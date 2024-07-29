package com.green.temp;

import java.util.Scanner;

public class Example13 {
    public static void main(String[] args) {
        // 13. 정부는 긴급재난지원금을 받을 대상자를 판별하기 위한 조건을 아래와 같이 수립하였다.
        // 월소득을 입력하면 수급대상자인지 아닌지 출력해주는 프로그램을 만들자.
        // - 소득 기준 4,000,000원 이하
        // - 다른 지원금을 받지 않는 세대
        Scanner scanner = new Scanner(System.in);

        System.out.println("정부 긴급재난지원금 확인 시스템입니다.");
        System.out.println("대상자 확인을 위해 월 소득을 입력해주세요");
        int monthlyIncome = scanner.nextInt();
        if (monthlyIncome < 4000000 ) {
            System.out.printf("입력하신 월 소득은 %d원 이며 긴급 재난금 지원 대상입니다", monthlyIncome);
        } else {
            System.out.printf("입력하신 월 소득은 %d원 이며 긴급 재난금 지원 대상이 아닙니다.", monthlyIncome);
        }


    }
}
