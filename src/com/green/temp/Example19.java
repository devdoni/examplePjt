package com.green.temp;

public class Example19 {
    // 19. 13시 30분 25초를 초로 나타내는 프로그램을 만드시오.
    public static void main(String[] args) {
        System.out.println("13시 30분 25초를 초로 나타내면");
        int hours = 13;
        int minutes = 30;
        int seconds = 25;
        int totalSeconds = hours * 3600 + minutes * 60 + seconds;
        System.out.printf("총 %d 초 입니다.", totalSeconds);

    }
}
