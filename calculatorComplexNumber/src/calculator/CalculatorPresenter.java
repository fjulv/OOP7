package calculator;

import java.util.logging.Logger;

public class CalculatorPresenter {
    private CalculatorView view;
    private CalculatorModel model;
    private static final Logger logger = Logger.getLogger(CalculatorPresenter.class.getName());

    public CalculatorPresenter(CalculatorView view, CalculatorModel model) {
        this.view = view;
        this.model = model;
    }

    public void performCalculation() {
        logger.info("Работает класс CalculatorPresenter");
        double numberReal1 = view.getInputRealNumber(1);
        double numberImaginary1 = view.getInputImaginaryNumber(1);
        char operator = view.getInputOperator();
        double numberReal2 = view.getInputRealNumber(2);
        double numberImaginary2 = view.getInputImaginaryNumber(2);


        switch (operator) {
            case '+':
                System.out.println("Результат сложения:");
                model = new Add();
                model.mathAction(numberReal1, numberImaginary1, numberReal2, numberImaginary2);
                break;
            case '*':
                System.out.println("Результат умножения:");
                model = new Multiply();
                model.mathAction(numberReal1, numberImaginary1, numberReal2, numberImaginary2);
                break;
            case '/':
                System.out.println("Результат деления:");
                model = new Divide();
                model.mathAction(numberReal1, numberImaginary1, numberReal2, numberImaginary2);
                break;
            default:
                System.out.println("Введен неверный оператор");
        }

    }
}
