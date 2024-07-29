package com.green.temp;

import java.util.Scanner;

public class Example29 {
    // 29. 다음의 요구사항을 충족시키는 프로그램을 만드시오.
    //  - 아침 최저 기온을 입력한다.
    //  - 오후 최고 기온을 입력한다.
    //  - 일교차가 10도 이상이면 ‘감기 조심하세요.’를 출력한다.
    //  - 오후 최고 기온이 28도 이상이고 일교차가 10도 미만이면 ‘초여름 날씨입니다.’를 출력한다.
    public static void main(String[] args) {
        System.out.println("날씨에 따른 메세지 출력 프로그램");
        Scanner sc = new Scanner(System.in);

        System.out.println("아침 최저 기온을 입력해주세요: ");
        double lowTemperature = sc.nextDouble();

        System.out.println("오후 최고 기온을 입력해주세요: ");
        double highTemperature = sc.nextDouble();

        double temperatureRange = highTemperature - lowTemperature;

        if (highTemperature >= 28 && temperatureRange < 10) {
            System.out.println("일교차가" + temperatureRange + "도 미만이고 최고 온도가"+ highTemperature + "도 입니다 더위 조심하세요!");

        } else if (temperatureRange >= 10) {
            System.out.printf("일교차가 %.1f도 입니다, 감기 조심하세요!", temperatureRange);

        } else {
            System.out.println("올바르지 않은 온도입니다.");

        } sc.close();
    }

}
