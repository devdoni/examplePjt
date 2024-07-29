package com.green.temp;

import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        //12.  그린 마트는 수입과 지출을 입력하면 흑자인지 적자인지 판별하는 프로그램을 도입하려고 한다.
        // 마트 수익 결과를 알려주는 프로그램을 만들어보자.
        Scanner scanner = new Scanner(System.in);
        System.out.println("마트의 수입을 입력해주세요: ");
        int martIncome = scanner.nextInt();
        System.out.println("마트의 지출을 입력해주세요: ");
        int expenditure = scanner.nextInt();

        int profit = martIncome - expenditure;

        if (profit < 0) {
            System.out.printf("수익 결과는 %d원이며 적자입니다", profit);
        } else {
            System.out.printf("수익 결과는 %d원이며 흑자입니다", profit);
        }


    }
}
