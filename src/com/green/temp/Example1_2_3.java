package com.green.temp;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Example1_2_3 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // 현재 날짜와 시간 가져오기
    LocalDateTime currentDateTime = LocalDateTime.now();

    int year = currentDateTime.getYear();
    int month = currentDateTime.getMonthValue();
    int day = currentDateTime.getDayOfMonth();
    int hour = currentDateTime.getHour();
    int minute = currentDateTime.getMinute();
    int second = currentDateTime.getSecond();
    String currentTime = year + "-" + month + "-" + day + " " + hour + ":" + minute + ":" + second;

    // 이름과 전공을 입력받고 출력
        System.out.println("이름을 입력해주세요.");
    String name = scanner.next();
        System.out.println("전공을 입력해주세요.");
    String major = scanner.next();

    //현재 시간과 함께 정보를 출력
        System.out.println("현재 시간:"+  currentTime +"\n이름:" + name + "\n전공:" + major);

        System.out.println(name + "님의 국어 점수를 입력해주세요");
    int kor = scanner.nextInt();
        System.out.println(name + "님의 영어 점수를 입력해주세요");
    int eng = scanner.nextInt();
        System.out.println(name + "님의 수학 점수를 입력해주세요");
    int math = scanner.nextInt();

    int total = kor + eng + math;
    int avg = total / 3;
        System.out.println(name + "님의 과목 총점수:" + total + "점");
        System.out.println(name + "님의 과목 평균:" + avg + "점");

        scanner.close();
    }

}