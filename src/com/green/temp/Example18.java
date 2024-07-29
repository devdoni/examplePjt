package com.green.temp;

import java.util.Scanner;

public class Example18 {
    //18. 사용자가 길이(cm)를 입력하면 inch로 환산하는 프로그램을 만드시오(단, 1cm는 0.39inch로 한다).
    public static void main(String[] args) {
        System.out.println("Inch 계산 프로그램");

        Scanner scanner = new Scanner(System.in);

        System.out.println("길이를 입력해주세요: ");
        double inputCm = scanner.nextDouble();
        double inch = 0.39;
        double totalInch = inputCm * inch;
        System.out.printf("입력한 길이는 %.1fcm 이며 인치로 환산시 %.1f인치 입니다" , inputCm, totalInch);
    }
}
