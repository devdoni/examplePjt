package com.green.temp;

import java.util.Scanner;

public class Example06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("방의 가로 길이를 입력해주세요");
        double width = scanner.nextDouble();
        System.out.println("방의 세로 길이를 입력해주세요");
        double height = scanner.nextDouble();
        double area = width * height;

        System.out.println("총 넓이는 " + area + "m²입니다");


    }
}
