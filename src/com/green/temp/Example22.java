package com.green.temp;

import java.util.Scanner;

public class Example22 {
    //22. 기계의 온도를 감지하여 팬을 자동으로 구동하는 장치를 만들려고 한다. 다음 요구사항을 참고하여 프로그램을 만들자.
    //  - 기계 온도를 입력한다.
    //  - 기계 온도가 40 이상이면 ‘팬(Fan) 가동’을 출력한다.
    //  - 기계 온도가 40 미만이면 ‘팬(Fan) 중지’를 출력한다.
    public static void main(String[] args) {
        System.out.println("기계 온도 감지 프로그램");
        Scanner scanner = new Scanner(System.in);

        System.out.println("기계 온도를 입력해주세요");
        double temperature = scanner.nextDouble();

        if (temperature >= 40) {
            System.out.println("팬(Fan) 가동");
        } else {
            System.out.println("팬(Fan) 중지");
        }
        scanner.close();
    }
}
