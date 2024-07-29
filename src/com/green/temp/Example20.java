package com.green.temp;

import java.util.Scanner;

public class Example20 {
    // 20. 다음 요구 조건에 맞는 프로그램을 만드시오.
    //  - 한 개에 340원 하는 마스크 x개를 구매하고, y원을 지불했을 때 거스름돈 result를 화면에 출력한다.
    public static void main(String[] args) {
        System.out.println("마스크 가격 계산 프로그램");
        Scanner scanner = new Scanner(System.in);

        System.out.printf("구매할 마스크 갯수를 입력해주세요(개당 340원): ");
        int needMask = scanner.nextInt();

        System.out.printf("지불할 금액을 입력해주세요: ");
        int amount = scanner.nextInt();

        int result = amount - ( needMask * 340 );

        System.out.printf("거스름돈은 %d원 입니다", result);


    }
}
