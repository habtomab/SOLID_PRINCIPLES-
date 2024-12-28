package Solid.dependencyInversion.good;

public class AddOperation implements CalculatorOperation {


    @Override
    public int calculate(int n, int m) {
        return n+m;
    }
}
