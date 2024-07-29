package com.green.temp;

import java.util.Scanner;

public class Example15 {
    //15. 속도와 시간을 입력하면 자동차의 주행 거리를 구하는 프로그램을 만들자.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("자동자 주행 거리 계산 프로그램");

        System.out.println("자동차의 속도를 입력해주세요(KM)");
        int km = scanner.nextInt();

        System.out.println("시간을 입력해주세요(h)");
        int hour = scanner.nextInt();
        int total = km * hour;

        System.out.printf("시속 %dKm로 %d시간동안 주행하면 총%dKm 이동할 수 있습니다.", km, hour, total);

    }

}
