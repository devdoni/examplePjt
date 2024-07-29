package com.green.temp;

import java.util.Scanner;

public class Example26 {
    //26. 다음 표는 심장 정지 환자에게 자동 심장 충격기를 사용했을 때 최초로 시행한 시간에 따른 환자의 생존율을 나타내다.
    //    표를 보고 장비를 사용하기까지 걸린 시간을 입력하면 생존율이 출력되는 프로그램을 만들자.
    //   시간: 60초 이하 --> 생존률: 85%
    //   시간: 60초 초과 120초 이하 --> 생존률: 76%
    //   시간: 120초 초과 180초 이하 --> 생존률: 66%
    //   시간: 180초 초과 300초 이하 --> 생존률: 47%
    //   시간: 360초 초과 --> 생존률: 25%미만
    public static void main(String[] args) {
        System.out.println("자동 심장 충격기를 사용했을 때 최초로 시행한 시간에 따른 환자 생존율 확인 프로그램");

        Scanner scanner = new Scanner(System.in);

        System.out.println("장비를 사용하기까지 걸린 시간을 입력해주세요: ");
        int secondsToUse = scanner.nextInt();

        if (secondsToUse > 360) {
            System.out.println("생존률이 25% 미만입니다.");

        } else if (secondsToUse > 180 && secondsToUse <= 299) {
            System.out.println("생존률이 47% 입니다.");

        } else if (secondsToUse > 120 && secondsToUse <= 179) {
            System.out.println("생존률이 66% 입니다.");

        } else if (secondsToUse > 60 && secondsToUse <= 119) {
            System.out.println("생존률이 76% 입니다.");

        } else if (secondsToUse <= 60) {
            System.out.println("생존률이 85% 입니다.");

        } else {
            System.out.println("유효하지 않은 시간입니다.");
        }

        scanner.close();
    }
}