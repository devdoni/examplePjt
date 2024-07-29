package com.green.temp;

public class Example41 {
    //  중첩 반복문을 이용하여 ‘*’가 트리 모양으로 출력될 수 있도록 프로그램을 만드시오.
    //      *
    //     ***
    //    *****
    //   *******
    //  *********
    // ***********
    public static void main(String[] args) {
        int height = 8;
            for(int i = 1; i <= height; i++){
                for (int j = i; j < height; j++){
                    System.out.print(" ");
                }
                for (int k = 1; k <= (2 * i - 1); k++){
                    System.out.print("*");
            }
                System.out.println();

        }

    }

}
