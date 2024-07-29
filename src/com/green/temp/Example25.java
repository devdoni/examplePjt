package com.green.temp;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Example25 {
    //25. 고농도 미세먼지 비상저감조치를 위한 차량 2부제 프로그램을 만들자.입니다.
    //  - 오늘 날짜 입력
    //  - 차량번호 4자리 입력
    //  - 2부제에 따라 운행가능 여부 출력
    public static void main(String[] args) {
        System.out.println("차량 2부제 확인 프로그램");
        Scanner scanner = new Scanner(System.in);

        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String formattedDate = today.format(formatter);
        int dayOfMonth = today.getDayOfMonth();

        System.out.println("오늘 날짜는" + formattedDate + "입니다");
        System.out.println("차량번호 4자리를 입력해주세요");

        int CarNumber = scanner.nextInt();
        if (CarNumber >= 10000 ) {
            System.out.println("올바른 차량 번호를 입력해주세요");
            return;
       }
        if (dayOfMonth % 2 == 0 && CarNumber % 2 == 0 ) {
            System.out.printf("차량번호 %d는 오늘 운행 가능합니다.", CarNumber);

        } else if (dayOfMonth % 2 == 1 && CarNumber % 2 == 1 ) {
            System.out.printf("차량번호 %04d은 오늘 운행 가능합니다.", CarNumber);

        } else {
            System.out.printf("차량번호 %04d은 오늘 운행 불가능합니다.", CarNumber);

        }




    }
}
