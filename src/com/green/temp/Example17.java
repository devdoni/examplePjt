package com.green.temp;

import java.util.Scanner;

public class Example17 {
    //17. 밤 최저 기온과 낮 최고 기온을 입력하면 일교차를 출력하는 프로그램을 만들자.
    public static void main(String[] args) {
        System.out.println("일교차 계산 프로그램");

        Scanner scanner = new Scanner(System.in);
        System.out.println("최고 기온을 입력해주세요: ");
        double highestTemperature = scanner.nextDouble();

        System.out.println("최저 기온을 입력해주세요: ");
        double lowestTemperature = scanner.nextDouble();

        double temperatureRange = highestTemperature - lowestTemperature;

        System.out.printf("입력한 최고 기온은 %.1f도%n입력한 최저 기온은 %.1f도 이며%n일교차는 %.1f도 입니다", temperatureRange, highestTemperature, lowestTemperature);

    }

}
