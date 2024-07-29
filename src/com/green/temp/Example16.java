package com.green.temp;

import java.util.Scanner;

public class Example16 {
    // 16. A회사는 3대의 컴퓨터로 8시간을 일하면 하루 업무를 처리할 수 있다.
    // 그런데 단축 근무를 하게 되어 근무 시간이 줄게 되었다면 몇 대의 컴퓨터가 더 필요할까요?
    // 근무 시간을 입력하면 필요한 컴퓨터 수량을 파악하는 프로그램을 만들자.

    public static void main(String[] args) {
        int defaultComputers = 3; // 기본 컴퓨터 수
        int defaultHours = 8;     // 기본 근무 시간
        int totalWork = defaultComputers * defaultHours; // 하루 업무량

        // 사용자로부터 단축 근무 시간 입력 받기
        Scanner scanner = new Scanner(System.in);
        System.out.println("총 근무 시간을 입력해주세요: ");
        int workTime = scanner.nextInt();

        // 필요한 컴퓨터 수 계산
        double requiredComputers = (double) totalWork / workTime;
        int roundedComputers = (int) Math.ceil(requiredComputers);

        // 결과 출력
        System.out.printf("단축된 근무 시간은 %d 시간이며 필요한 컴퓨터 수량은 %d대 입니다.", workTime, roundedComputers);
    }
}
