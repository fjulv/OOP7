package calculator;

public class CalculatorModel implements CalculatorUsable {
    double numR1;
    double numIm1;
    double numR2;
    double numIm2;

    public CalculatorModel(double numR1, double numIm1, double numR2, double numIm2) {
        this.numR1 = numR1;
        this.numIm1 = numIm1;
        this.numR2 = numR2;
        this.numIm2 = numIm2;
    }

    public CalculatorModel() {

    }

    @Override
    public void mathAction(double numR1, double numIm1, double numR2, double numIm2) {

    }
}
