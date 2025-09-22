package nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMainV1 {

    public static void hello(Process process) {
        System.out.println("프로그램 시작");

        //조각단위로 분리
        //코드 조각 시작
        process.run();
        //코드 조각 종료

        System.out.println("프로그램 종료");
    }

    //상속받아 재구성
    //구성
    static class Dice implements Process {

        @Override
        public void run() {
            int randomValue = new Random().nextInt(6) + 1;
            System.out.println("주시위 = " + randomValue);
        }
    }

    static class Sum implements Process {

        @Override
        public void run() {
            for (int i = 0; i < 3; i++) {
                System.out.println("i = " + i);
            }
        }
    }

    public static void main(String[] args) {
        Dice dice = new Dice();
        Sum sum = new Sum();

        System.out.println("Hello 실행하기");
        hello(dice);
        hello(sum);
    }

}
