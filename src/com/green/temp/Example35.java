package com.green.temp;

public class Example35 {
    // 35. 구구단 전체를 가로로 출력하는 프로그램을 만들자.
    public static void main(String[] args) {
        System.out.println("구구단 전체를 가로로 출력하는 프로그램");

        for (int i = 2; i < 10; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%d x %d = %d\t", i, j, (i * j));
            }
            System.out.println();
        }
    }
}
