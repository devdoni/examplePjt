package com.green.temp;

import java.util.Scanner;

public class Example14 {
    //14. 해수면에서 10m 내려갈 때마다 수온이 0.7도씩 내려간다고 가정할 때, 수심을 입력하면 수온을 계산하는 프로그램
    //을 만들자(단 해수면의 온도는 20도이다.)

    public static void main(String[] args) {
    double temperature = 20.0;
    double temperatureDecreasePerMeter = 0.7 / 10;

    Scanner scanner = new Scanner(System.in);
        System.out.println("수심을 입력해주세요 (미터): ");
    int depth = scanner.nextInt();

    double temperatureAtDepth = temperature - (depth * temperatureDecreasePerMeter);

        System.out.printf("입력한 수심은 %d미터이며 해당 수심의 수온은 %.2f도 입니다.%n", depth, temperatureAtDepth);
}
}
