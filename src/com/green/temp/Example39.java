package com.green.temp;

public class Example39 {
    // 39. 50보다 작은 7의 배수를 출력하는 프로그램을 만드시오.
    public static void main(String[] args) {
        System.out.println("50보다 작은 7의 배수를 출력하는 프로그램");
        int num = 7;
        int limit = 50;
        for (int i = 1 ; i < limit ; i++) {
            if ( i % num == 0 ) {
                System.out.println(i);
            }
        }
        System.out.println();
    }
}
