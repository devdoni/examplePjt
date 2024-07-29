package com.green.temp;

import java.util.Random;
import java.util.Scanner;

public class Example08 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("홀 or 짝을 입력해주세요");
        String userInput = scanner.next();

        int randomInt = random.nextInt(10);
        if (randomInt % 2 == 0) {
            System.out.println("결과는 짝 입니다");

        } else {
            System.out.println("결과는 홀 입니다");

        }

    }
}
