package com.green.temp;

public class Example42 {
    // 42. 그림역에는 3개 노선의 열차가 오전 9시부터 오후 6시까지 교차 운행한다. 3대의 열차가 교차하는 시간을 구해 열
    //차 충돌 사고를 막자. (단 매일 오전 9시에 한빛역에서 모든 열차가 출발한다).
    // - A열차 운행간격: 10분
    // - B열차 운행간격: 25분
    // - C열차 운행간격: 30분

    public static void main(String[] args) {
        int intervalA = 10;
        int intervalB = 25;
        int intervalC = 30;

        // 세 간격의 최소 공배수
        int lcmAB = lcm(intervalA, intervalB);
        int lcmABC = lcm(lcmAB, intervalC);

        System.out.printf("세 열차가 동시에 교차하는 시간 간격: %d분%n", lcmABC);

        // 오전 9시부터 오후 6시까지의 시간을 분으로 변환
        int startMinutes = 9 * 60; // 540
        int endMinutes = 18 * 60; // 1080

        System.out.println("오전 9시부터 오후 6시까지 세 열차가 동시에 교차하는 시간");
        for (int time = startMinutes; time <= endMinutes; time += lcmABC) {
            int hours = time / 60;
            int minutes = time % 60;
            System.out.printf("%02d:%02d%n", hours, minutes);
        }

    }

    // 최대 공약수를 구하는 메서드
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    // 최소공배수를 구하는 메서드
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}
