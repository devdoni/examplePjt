package com.green.temp;

public class Example38 {
    // 38. for문을 이용해서 1~100까지 정수 중에서 3과 7의 공배수와 최소공배수를 출력하시오.
    public static void main(String[] args) {
        int limit = 100;
        int num1 = 3;
        int num2 = 7;
        // 최소공배수
        System.out.println("1~100 까지 정수 중에서 3과 7의 공배수와 최소공배수를 구하는 프로그램");
        for (int i = 1; i <= limit; i++) {
            if (i % num1 == 0 && i % num2 == 0) {
                System.out.printf("%d과 %d의 공배수는 %d\n", num1, num2, i);

            }
        }   System.out.println("3과 7의 최소 공배수는" + num1 * num2);

    }

}
