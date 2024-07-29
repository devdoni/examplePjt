package com.green.temp;

public class Example10 {
    // 10. 회사원인 길동이는 예금 계획을 세우고 있다.
    // 은행에서 상담을 받아 보니 5년 정기 예금을 복리로 했을 때 가장 큰 목돈을 마련할 수 있다고 알게 되었다.
    // 길동이가 500만원씩 5년 만기인 정기 예금 상품에 가입했을 때 5년 후 받을 총 수령액을 계산하자.(이자율: 연 5%).
    public static void main(String[] args) {
        double amount = 5000000;        // 길동이의 돈 500만원
        double percent = 5;                  // 연 이자율 5%

        double result = amount * (percent / 100);
        int total = (int) amount + (int)(result * 5);

        System.out.println("길동이가 5년후 받은 총 수령액은" + total +"원 이다.");
    }
}
