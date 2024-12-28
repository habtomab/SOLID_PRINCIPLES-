package Solid.dependencyInversion.good;



public class SubtractOperation implements CalculatorOperation {

    @Override
    public int calculate(int n, int m) {
        return n-m;
    }
}
