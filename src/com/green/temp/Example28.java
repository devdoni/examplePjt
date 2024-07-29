package com.green.temp;

import java.util.Scanner;

public class Example28 {
    //28. 사용자가 입력한 문자 메시지 길이에 따라서 SMS 또는 MMS의 발송을 결정하는 프로그램을 만들자.
    //(단, 메시지 길이가 50 이하면 SMS 발송, 그렇지 않으면 MMS를 발송한다)
    public static void main(String[] args) {
        System.out.println("MMS 발송 결정 시스템");
        Scanner scanner = new Scanner(System.in);

        System.out.println("전송할 문자를 입력해주세요");
        String msg = scanner.nextLine();
        int msgLen = msg.length();
        if (msgLen >= 50) {
            System.out.println("입력한 문자를 MMS로 발송했습니다.");
        } else {
            System.out.println("입력한 문자를 SMS로 발송했습니다.");
        }
        scanner.close();
    }
}
