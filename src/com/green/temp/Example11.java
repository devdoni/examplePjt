package com.green.temp;

import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("키를 입력해주세요");
        int height = scanner.nextInt();

        if (height <= 120) {
            System.out.println("놀이기구를 탑승할 수 있습니다!");
        } else {
            System.out.println("놀이기구를 탑승할 수 없습니다!");
        }
    }
}
