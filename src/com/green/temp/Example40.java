package com.green.temp;

public class Example40 {
    // 40. 가로와 세로 길이의 변화에 따른 삼각형의 넓이를 구하는 프로그램을 만들어 보자.
    // 단 가로 길이는 1부터 2의 배수로 증가하고 세로 길이는 1부터 3의 배수로 증가하며, 삼각형의 넓이가 150보다 크면 프로그램을 종료한다.
    public static void main(String[] args) {
        int width = 1;
        int height = 1;

        while (true) {
            // 삼각형의 넓이를 구한다
            double area = 0.5 * width * height;

            // 삼각형의 넓이를 출력한다
            System.out.printf("가로 길이: %d, 세로 길이: %d, 삼각형의 넓이: %.2f%n", width, height, area);

            // 넓이가 150보다 크면 프로그램을 종료한다
            if (area > 150) {
                break;
            }

            // 가로 길이는 2씩 증가
            width += 2;

            // 세로 길이는 3씩 증가
            height += 3;
        }
    }
}