package com.example.calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    /**속성*/
    private final List<Double> history;

    /**생성자*/
    Calculator() {
        this.history = new ArrayList<>();
    }

    /**메서드*/
    public double calculate(double num1, double num2, char op) {
        double result;
        if (op == '+') {
            result = num1 + num2;
        } else if (op == '-') {
            result = num1 - num2;
        } else if (op == '*') {
            result = num1 * num2;
        } else if (op == '/') {
            if (num2 == 0) {
                System.out.println("나눗셈 연산에서 분모에 0이 입력될 수 없습니다.");
                return Double.NaN;
            }
            result = num1 / num2;
        } else {
            System.out.println("잘못된 연산자입니다.");
            return Double.NaN;
        }
        /**연산 결과 저장*/
        history.add(result);
        return result;
    }
    /**getter 메서드*/
    public List<Double> getHistory() {
        return new ArrayList<>(history);
    }
    /**삭제 메서드*/
    public void removeResult() {
      if (history.isEmpty()) {
        System.out.println("삭제할 연산 기록이 없습니다.");
        return;
    }
    history.remove(0);
    System.out.println("가장 오래된 연산 기록이 삭제되었습니다.");
    System.out.println("현재 연산 기록: " + history);
    }
}
