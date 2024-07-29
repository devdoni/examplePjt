package com.green.temp;

import java.util.Scanner;

public class Example07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("이름을 입력해주세요");
        String name = scanner.next();
        System.out.println("키를 입력해주세요");
        double personHeight = scanner.nextDouble();
        System.out.println("몸무게를 입력해주세요");
        double personWeight = scanner.nextDouble();
        System.out.println(name + "님의 키:" + personHeight + "몸무게:" + personWeight);
        double heightCmInMeters = personHeight / 100;
        double bmi = personWeight / (heightCmInMeters * heightCmInMeters);
        System.out.printf("%s님의 체질량지수는: %.2f\n" ,name,bmi);

        if (bmi < 18.5) {
            System.out.println("저체중 입니다.");

        } else if (bmi >= 18.5 && bmi <= 23) {
            System.out.println("정상체중 입니다.");

        } else if (bmi >= 23 && bmi <= 25) {
            System.out.println("과체중 입니다.");

        } else if (bmi >= 25) {
            System.out.println("비만 입니다");
        }
    }
}
