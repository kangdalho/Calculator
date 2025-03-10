package com.example.calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);
        try{
        while (true) {
            System.out.println("첫 번째 숫자를 입력하세요: ");
            double num1 = sc.nextDouble();

            System.out.println("사칙연산 기호를 입력하세요(+,-,*,/): ");
            char op = sc.next().charAt(0);

            System.out.println("두 번째 숫자를 입력하세요: ");
            double num2 = sc.nextDouble();

            double result = calculator.calculate(num1, num2, op);
            System.out.println("값 = " + result);

            System.out.println("현재 연산 기록:" + calculator.getHistory());

            System.out.println("연산 기록을 삭제하시겠습니까?(yes 입력시 삭제)");
            String deleteAnswer = sc.next();
            if (deleteAnswer.equalsIgnoreCase("yes")) {
                calculator.removeResult();
            }

            System.out.println("더 계산하시겠습니까?(exit 입력시 종료)");
            String answer2 = sc.next();
            if (answer2.equalsIgnoreCase("exit"))
                break;
        }
    } finally{
            sc.close();
            System.out.println("scanner를 닫았습니다.");
    }
  }
}
