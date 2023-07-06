package calculator;

import java.util.logging.Logger;

public class Add extends CalculatorModel implements CalculatorUsable {
    private static final Logger logger = Logger.getLogger(Add.class.getName());

    @Override
    public void mathAction(double numR1, double numIm1, double numR2, double numIm2) {
        logger.info("Отработал класс Add");
        double resR = numR1 + numR2;
        double resIm = numIm1 + numIm2;
        String res = null;
        if (resIm < 0) {
            res = (resR + " " + resIm + "i");
        } else {
            res = (resR + " + " + resIm + "i");
        }
        System.out.println(res);
    }
}
