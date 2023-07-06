package calculator;

import java.util.Scanner;

public class CalculatorView {

    private Scanner scanner;

    public CalculatorView() {
        this.scanner = new Scanner(System.in);
    }

    public double getInputRealNumber(int i) {
        System.out.println("Введи действительную часть " + i + "-го числа: ");
        return scanner.nextDouble();
    }

    public double getInputImaginaryNumber(int i) {
        System.out.println("Введи мнимую часть " + i + "-го числа: ");
        return scanner.nextDouble();
    }

    char getInputOperator() {
        System.out.print("Введи оператор (+, *, /): ");
        return scanner.next().charAt(0);
    }

//    public void displayResult(String result) {
//        System.out.println("Результат: " + result);
//    }
}
