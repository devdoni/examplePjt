package com.green.temp;

import java.util.Scanner;

public class Example04_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("회사명을 입력해주세요");

        String componyName = scanner.next();

        System.out.println(componyName + "회사의 1월 매출액을 입력해주세요");
        int oneMonthSales  = scanner.nextInt();

        System.out.println(componyName + "회사의 2월 매출액을 입력해주세요");
        int twoMonthSales  = scanner.nextInt();

        System.out.println(componyName + "회사의 3월 매출액을 입력해주세요");
        int threeMonthSales  = scanner.nextInt();

        int totalFirstQuarter = oneMonthSales + twoMonthSales + threeMonthSales;
        System.out.println(componyName +"회사의 1분기 총 매출액은: " + totalFirstQuarter + "원 입니다");

        System.out.println(componyName + "회사의 1월 매입액을 입력해주세요");
        int oneMonthPurchase = scanner.nextInt();

        System.out.println(componyName + "회사의 2월 매입액을 입력해주세요");
        int twoMonthPurchase = scanner.nextInt();

        System.out.println(componyName + "회사의 3월 매입액을 입력해주세요");
        int threeMonthPurchase = scanner.nextInt();

        int totalPurchase = oneMonthPurchase + twoMonthPurchase + threeMonthPurchase;
        System.out.println(componyName + "회사의 1분기 매입액은 총:" + totalPurchase + "원 입니다" );

        int revenue = totalFirstQuarter - totalPurchase;
        System.out.println(componyName + "회사의 1분기 이익은 총:" + revenue + "원 입니다");
    }
}
