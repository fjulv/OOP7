package calculator;

import java.util.logging.Logger;

public class Multiply extends CalculatorModel implements CalculatorUsable {
    private static final Logger logger = Logger.getLogger(Multiply.class.getName());

    @Override
    public void mathAction(double numR1, double numIm1, double numR2, double numIm2) {
        logger.info("Отработал класс Multiply");
        double resR = numR1 * numR2 - numIm1 * numIm2;
        double resIm = numR1 * numIm2 + numIm1 * numR2;
        String res = null;
        if (resIm < 0) {
            res = (resR + " " + resIm + "i");
        } else {
            res = (resR + " - " + resIm + "i");
        }
        System.out.println(res);
    }
}
