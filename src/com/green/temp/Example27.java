package com.green.temp;

import java.util.Scanner;

public class Example27 {
    //27. 전기를 많이 사용하면 누진세가 붙어 단가와 기본요금이 올라간다. 다음 누진제가 적용된 단가표를 참고하여 전
    //기 사용량을 입력하면 전기료가 출력되는 프로그램을 만들자.
    //  - 사용량: 200이하 --> 단가: 99.3 --> 기본요금: 910원
    //  - 사용량: 200초과 400이하 --> 단가: 187.9 --> 기본요금: 1600원
    //  - 사용량: 400초과 --> 단가: 280.6 --> 기본요금: 7300원
    public static void main(String[] args) {
        System.out.println("전기세 계산 프로그램");
        Scanner scanner = new Scanner(System.in);

        System.out.println("전기 사용량을 입력해주세요(kW)");
        double kW = scanner.nextDouble();
        double totalPrice;
        if (kW >= 400) {
            totalPrice = (kW * 280.6) + 7300;
            System.out.printf("총 사용량은 %.2f kW이며 총 요금은 %.2f원 입니다", kW, totalPrice);

        } else if (kW >= 200 && kW <= 399) {
            totalPrice = (kW * 187.9) + 910;
            System.out.printf("총 사용량은 %.2fkW이며 총 요금은 %.2f원 입니다", kW, totalPrice);

        } else if (kW <= 199) {
            totalPrice = (kW * 99.3) + 1600;
            System.out.printf("총 사용량은 %.2fkW이며 총 요금은 %.2f원 입니다", kW, totalPrice);
        } else {
            System.out.println("올바르지 않은 사용량입니다.");
        }
        scanner.close();
    }
}
