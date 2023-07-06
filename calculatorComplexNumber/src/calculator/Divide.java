package calculator;

import java.util.logging.Logger;

public class Divide extends CalculatorModel implements CalculatorUsable {
    private static final Logger logger = Logger.getLogger(Divide.class.getName());
    @Override
    public void mathAction(double numR1, double numIm1, double numR2, double numIm2) {
        logger.info("Отработал класс Divide");
        String res = null;
        double res1 = numR1 * numR2 + numIm1 * numIm2;
        double res2 = numIm1 * numR2 - numR1 * numIm2;
        double res3 = numR2 * numR2 + numIm2 * numIm2;
        if (res3 != 0) {
            if (res2 / res3 < 0) {
                res = (res1 / res3 + " " + res2 / res3 + "i");
            } else {
                res = (res1 / res3 + " + " + res2 / res3 + "i");
            }
        } else {
            System.out.println("Нельзя делить первое число на второе");
        }
        System.out.println(res);
    }
}
