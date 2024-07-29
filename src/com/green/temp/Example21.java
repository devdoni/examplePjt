package com.green.temp;

import java.util.Scanner;

public class Example21 {
    //21. 제한 속도가 50km/h인 도로에서 속도위반을 하는 자동차에 경고를 하는 프로그램을 만들자.
    public static void main(String[] args) {
        System.out.println("속도위반 경고 프로그램");
        Scanner scanner = new Scanner(System.in);

        System.out.println("현재 속력을 입력해주세요: ");
        int carSpeed = scanner.nextInt();
        int maximumSpeed = 50;
        if (carSpeed >= maximumSpeed) {
            System.out.println("제한 속도(시속 50km)를 초과했습니다, 속도를 줄여주세요.");

        } else {
            System.out.println("규정 속도(시속 50km)를 잘 지키고 있습니다, 계속 유지해주세요.");
        }
        scanner.close();
    }
}
